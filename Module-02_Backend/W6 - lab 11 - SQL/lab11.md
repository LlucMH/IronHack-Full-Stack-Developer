# Lab 11 - SQL

## Enterprise Java Development - Assignment 3.02

### 🗃️ 1. BLOG DATABASE - Normalización y DDL

#### 📌 Tablas normalizadas

- `Author(id, name)`
- `BlogPost(id, author_id, title, word_count, views)`

#### 📜 Script DDL

```sql
CREATE TABLE Author (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE BlogPost (
    id INT PRIMARY KEY AUTO_INCREMENT,
    author_id INT,
    title VARCHAR(255),
    word_count INT,
    views INT,
    FOREIGN KEY (author_id) REFERENCES Author(id)
);
```

### ✈️ 2. AIRLINE DATABASE - Normalización y DDL

#### 📌 Tablas normalizadas

- `Customer(id, name, status, total_miles)`
- `Aircraft(id, name, total_seats)`
- `Flight(id, flight_number, aircraft_id, mileage)`
- `Booking(id, customer_id, flight_id)`

#### 📜 Script DDL

```sql
CREATE TABLE Customer (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    status VARCHAR(50),
    total_miles INT
);

CREATE TABLE Aircraft (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    total_seats INT
);

CREATE TABLE Flight (
    id INT PRIMARY KEY AUTO_INCREMENT,
    flight_number VARCHAR(20),
    aircraft_id INT,
    mileage INT,
    FOREIGN KEY (aircraft_id) REFERENCES Aircraft(id)
);

CREATE TABLE Booking (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    flight_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (flight_id) REFERENCES Flight(id)
);

```

### 📊 3. Airline Database Queries

#### ✅ Total de vuelos:

```sql
SELECT COUNT(DISTINCT flight_number) AS total_flights FROM Flight;
```

#### ✅ Promedio de distancia de vuelo:

```sql
SELECT AVG(mileage) AS average_distance FROM Flight;
```

#### ✅ Promedio de asientos por avión:

```sql
SELECT AVG(total_seats) AS average_seats FROM Aircraft;
```

#### ✅ Promedio de millas por cliente según status:

```sql
SELECT status, AVG(total_miles) AS avg_miles
FROM Customer
GROUP BY status;
```

#### ✅ Máximo de millas por cliente según status:

```sql
SELECT status, MAX(total_miles) AS max_miles
FROM Customer
GROUP BY status;
```

#### ✅ Número de aeronaves que contienen 'Boeing':

```sql
SELECT COUNT(*) AS boeing_aircrafts
FROM Aircraft
WHERE name LIKE '%Boeing%';
```

#### ✅ Vuelos con distancia entre 300 y 2000 millas:

```sql
SELECT * FROM Flight
WHERE mileage BETWEEN 300 AND 2000;
```

#### ✅ Promedio de distancia por status:

```sql
SELECT c.status, AVG(f.mileage) AS avg_distance
FROM Booking b
JOIN Customer c ON b.customer_id = c.id
JOIN Flight f ON b.flight_id = f.id
GROUP BY c.status;
```

#### ✅ Aeronave más reservada por miembros Gold:

```sql
SELECT a.name, COUNT(*) AS booking_count
FROM Booking b
JOIN Customer c ON b.customer_id = c.id
JOIN Flight f ON b.flight_id = f.id
JOIN Aircraft a ON f.aircraft_id = a.id
WHERE c.status = 'Gold'
GROUP BY a.name
ORDER BY booking_count DESC
LIMIT 1;
```

