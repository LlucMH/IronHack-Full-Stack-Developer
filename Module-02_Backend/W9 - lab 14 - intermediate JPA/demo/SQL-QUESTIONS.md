## SQL nativo vs JPQL — 3 tareas que **no** puedes hacer con JPQL (y por qué elegir SQL nativo)

Aun cuando JPQL es portable y centrado en entidades, hay capacidades del motor SQL que JPQL no cubre. Aquí van **tres** casos claros con ejemplos y motivos.

---

### 1) CTEs recursivas (`WITH RECURSIVE`) para jerarquías
**Qué haces:** resolver árboles/grafos (p. ej., dependencias entre tareas) en **una sola** consulta.

**Por qué JPQL no puede:** JPQL no define CTEs ni recursividad; requerirías múltiples consultas o lógica imperativa en Java.

**Ejemplo:**
```sql
WITH RECURSIVE deps AS (
  SELECT td.parent_id, td.child_id, 1 AS depth
  FROM task_dependencies td
  WHERE td.child_id = :taskId
  UNION ALL
  SELECT td.parent_id, td.child_id, d.depth + 1
  FROM task_dependencies td
  JOIN deps d ON td.child_id = d.parent_id
)
SELECT * FROM deps ORDER BY depth;
```

Cuándo elegir SQL nativo: jerarquías profundas, necesidad de rendimiento y menor latencia (evitar round-trips).

### 2) Funciones de ventana (window functions) para analítica avanzada

Qué haces: rankings, acumulados, comparaciones entre filas sin colapsar resultados.

Por qué JPQL no puede: JPQL no soporta ROW_NUMBER, RANK, LAG/LEAD, ni SUM() OVER(...).

Ejemplos:

```sql
-- Ranking de contactos por empresa y apellido
SELECT
  id, company, last_name, first_name,
  ROW_NUMBER() OVER (PARTITION BY company ORDER BY last_name, first_name) AS rn
FROM contacts;

-- Acumulado de tareas completadas por fecha
SELECT
  due_date,
  SUM(CASE WHEN status = TRUE THEN 1 ELSE 0 END)
    OVER (ORDER BY due_date ROWS UNBOUNDED PRECEDING) AS completed_running_total
FROM tasks
WHERE due_date IS NOT NULL;
```
Cuándo elegir SQL nativo: informes/analytics en una pasada, sin postprocesar en Java ni consultas adicionales.

### 3) UPSERT atómico (insertar o actualizar en una sola sentencia)

Qué haces: insertar si no existe y actualizar si existe, protegiéndote de condiciones de carrera.

Por qué JPQL no puede: JPQL no estandariza UPSERT; necesitas la sintaxis específica del motor para atomicidad.

Ejemplos:

```sql
-- PostgreSQL
INSERT INTO contacts (company, title, salutation, first_name, middle_name, last_name)
VALUES (:company, :title, :salutation, :firstName, :middleName, :lastName)
ON CONFLICT (company, last_name, first_name)
DO UPDATE SET title = EXCLUDED.title;

-- MySQL / MariaDB
INSERT INTO contacts (company, title, salutation, first_name, middle_name, last_name)
VALUES (:company, :title, :salutation, :firstName, :middleName, :lastName)
ON DUPLICATE KEY UPDATE title = VALUES(title);
```
Cuándo elegir SQL nativo: necesitas idempotencia y atomicidad en alta concurrencia, evitando el patrón “buscar-luego-insertar/actualizar”.

**Resumen:** ¿por qué SQL nativo?

- Capacidades del motor no cubiertas por JPQL (CTEs, ventanas, UPSERT, JSON/FTS, etc.).
- Rendimiento superior al evitar múltiples consultas y procesamiento en Java.
- Control fino del plan de ejecución y acceso a extensiones específicas del SGBD.
