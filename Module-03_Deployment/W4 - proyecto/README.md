# Práctica M3

**LECCIÓN** *Obligatorio

## Proyecto Práctico Final Módulo 3

### Requisitos obligatorios

- Crear aplicación front con React / Angular / Vue / JS Vanilla (elige uno).
- Crear backend con Java Spring Boot / Node (Express/Fastify) / Supabase (elige uno).
- Implementar un modelo de datos mínimo Item con CRUD completo (crear, listar, ver, actualizar, borrar) y persistencia real.
- El frontend debe:
    - Mostrar listado, detalle y formulario de alta/edición de Item.
    - Consumir el backend real (no mocks) y manejar loading y errores.
    - Implementar búsqueda de un Item concreto.
    - Incluir un botón “Probar conexión” que consulta GET /api/health y muestra estado Conexión abierta/Sin conexión con la DB.
- README con instrucciones de arranque local, variables de entorno y rutas. Todo lo necesario para iniciar el proyecto debidamente.
- Pruebas básicas:
    - Backend: 1 test de integración del CRUD o colección Postman con scripts.
- Control de versiones: repo público, commits pequeños y mensajes claros.

### Requisitos opcionales

- CSS Básico
- CSS Responsive (móvil-first; ≤ 360px)
- Animaciones y transiciones (respetando prefers-reduced-motion)
- Implementación de Login (registro + login con JWT o Supabase Auth; rutas protegidas)
- Accesibilidad mínima (foco visible, labels, contraste ≥ 4.5:1)
- Docker Compose (front + back + db en un comando)
- CI simple (GitHub Actions: lint + test + build)
- Despliegue (front en Netlify/Vercel; back en Render/Fly.io)
- Exponer en backend al menos:
    - GET /api/health (ping de salud)
    - GET /api/items?search=&page=&pageSize= (listado con búsqueda y paginación)
    - POST /api/items (crear)
    - GET /api/items/:id (detalle)
    - PUT /api/items/:id (actualizar)
    - DELETE /api/items/:id (borrar)

### Enunciado del proyecto
Construye “MyItems”, una app CRUD de un único recurso Item que permita:

- Crear, listar, buscar, ver, editar y borrar items.
- Atributos de Item:
id, title (obligatorio), description (opcional), tags (array de strings), createdAt, updatedAt.
- La búsqueda filtra por title y tags vía ?search=....
- La paginación es de servidor (page, pageSize) y el front muestra controles (siguiente/anterior).
- Si la API devuelve error (400/404/500), el front muestra mensaje claro y recuperable.

*Objetivo: demostrar dominio básico de front + back conectados y entregar un proyecto ejecutable y comprensible en 40–60 h.*

### Alcance técnico (elige stack)

#### Backend (elige UNO)

- Node + Express + SQLite/PostgreSQL (Knex/Prisma) — o Fastify.
- Spring Boot (Java 17/21) + JPA + H2 (dev) / Postgres (prod).
- Supabase (Postgres + RPC/Edge Functions) como backend acelerado.

##### Requisitos backend

- Validación mínima en POST/PUT (title requerido).
- Respuestas JSON con data y meta de paginación:
{
  "data": [{ "id": 1, "title": "..." }],
  "meta": { "page": 1, "pageSize": 10, "total": 42 }
}
Explicar este código

- Seeds: script/comando para crear 10–20 items de prueba.

##### Frontend (elige UNO)

- React (Vite + React Router + fetch)
- Angular (standalone)
- Vue 3 (Vite + Vue Router)
- JS Vanilla (ESM + HTML templates)

###### Pantallas mínimas

- Listado con buscador (debounced), paginación y estado “sin resultados”.
- Detalle: muestra un item y sus tags.
- Formulario alta/edición: validar title; añadir/eliminar tags.
- Probar conexión: botón que consulta /api/health y muestra estado.

###### Estados

Loading, error, éxito (skeletons opcionales).

### Rúbrica de evaluación (40–60 h)
Criterio	Peso	Qué se evalúa
Conexión front–back funcional	25%	CRUD end-to-end, búsqueda y paginación operativas, health OK
Calidad del código	20%	Estructura, separación de capas, nombres, linter, tipados si aplica
UX básica	15%	Estados de carga/errores, formularios claros, aplicación de rendering condicional
Persistencia y modelo	15%	DB real + migraciones/seed; validaciones servidor
Pruebas y DX	15%	Test integración o Postman; scripts npm/maven; README claro
Extras (opcionales)	10%	CSS, Responsive, Login, Docker Compose, CI, despliegue, a11y

**Aprobado mínimo:** CRUD conectado + README + test básico + UX mínima(HTML).


### Plan de trabajo sugerido (5 días, 40–60 h)

**Día 1 (6–8 h)**
Repo + README + elección de stack.
Backend: esqueleto, /api/health, migración items, seed.
Front: proyecto base (Vite/CLI), router, página Lista + botón “Probar conexión”.

**Día 2 (6–8 h)**
Backend: CRUD con búsqueda/paginación.
Front: listado consumiendo API, búsqueda con debounce.

**Día 3 (6–8 h)**
Front: formulario alta/edición + validaciones + detalle.
UX: mensajes de error, loading, “sin resultados”.

**Día 4 (6–8 h)**
Pruebas: Back (crear→listar→actualizar→borrar) y Front (lista/sin resultados).
Limpieza, linter/format.

**Día 5 (6–8 h)**
Opcionales: CSS responsive + a11y mínima. Docker Compose o despliegue. Documentación y demo final.
Si añades login, reserva 1–2 días extra.


### Contrato de API (ejemplo)

GET /api/health

{ "status": "ok", "version": "1.0.0" }
Explicar este código

GET /api/items?search=foo&page=1&pageSize=10

{
  "data": [{ "id": 1, "title": "foo" }],
  "meta": { "page": 1, "pageSize": 10, "total": 42 }
}
Explicar este código

POST /api/items — Body

{
  "title": "My item",
  "description": "Optional",
  "tags": ["a","b"]
}
Explicar este código

GET /api/items/:id → 200 {...} | 404

PUT /api/items/:id → 200 {...} | 400/404

DELETE /api/items/:id → 204

**CORS:** permitir http://localhost:5173 (React/Vite) o el puerto del front.


### Estructura de repositorio (sugerida)

Monorepo:

myitems/
  README.md
  backend/
    src/...
    package.json | pom.xml
    prisma | migrations
    .env.example
  frontend/
    src/...
    package.json
    .env.example
  docker-compose.yml        # opcional
Explicar este código


### Scripts y puesta en marcha

**Backend (Node ejemplo)**

- npm run dev (nodemon)
- npm run migrate
- npm run seed
- npm test

**Frontend**

- npm run dev
- npm test (si aplica)

**Compose (opcional)**

- docker compose up -d (front + back + db)
Smoke local

curl http://localhost:3000/api/health
curl "http://localhost:3000/api/items?search=test&page=1&pageSize=5"
Explicar este código


### Prueba de nivel “tipo entrevista”
Elige una y descríbela en el README:

- **Login + ruta protegida**
Registro/login (JWT en localStorage o Supabase Auth). Solo usuarios logados pueden crear/editar/borrar. “Mi perfil” con email y logout.

- **Optimistic UI + reintentos**
Crear/editar/borrar actualiza la UI antes de la respuesta; si falla, deshace. Reintento exponencial (máx. 3).

- **Ordenación y filtros avanzados**
Parámetros: sort=createdAt|title&dir=asc|desc y filtro por tags.

- **Accesibilidad rápida**
Gestión de foco en modales, aria-live para avisos, Lighthouse A11y ≥ 90.

**Criterios:** claridad de código, manejo de estados/errores, comunicación HTTP, UX básica, tests.


### Entregables

- **URL del repo** con: código front y back, instrucciones claras de arranque.
- **Capturas** o GIF de lista/crear/buscar.
- Scripts de seed y un .env.example.
- Tests o colección Postman (+ instrucciones de ejecución).
- (Opcional) **URLs de despliegue** de front y back.


### Tips para no perder tiempo

- Empieza por /api/health y conéctalo desde el front el día 1.
- Crea seed pronto para ver listas reales.
- Maneja errores de red en el front desde el principio.
- Escribe el README durante el desarrollo.
- Mantén la UI simple (lista + formulario).
- Recuerda que puedes elegir hacer el proyecto del tema que quieras.