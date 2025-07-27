# Enterprise-Java-Development-2.06

## 📘 Student Grade System

### ✅ Funcionalidad implementada
- Clase `Student` con nombre y nota (0–100), validación de límites y `toString()`
- Mapa `<String, Student>` usando el nombre como clave
- Método `increaseGrades(Map<String, Student>)`: aumenta un 10% la nota de cada estudiante (máx. 100)
- 4 estudiantes iniciales con impresión antes y después de aumentar las notas

---

## 🧩 Use Case Diagram — Online Banking System

### 🎭 **Actors**
- **User**
- **Admin**

### 💼 **Use Cases for User**
- Transfer Funds
- Withdraw Funds
- Deposit Funds

### 🔐 **Use Case for Admin**
- Freeze Account

---

## 🧱 Class Diagram — Online Banking System

### **Class: User**
```java
- name: String  
- account: Account  
+ transferFunds(to: Account, amount: Money): void  
+ withdraw(amount: Money): void  
+ deposit(amount: Money): void  
``` 

### **Class: Admin (extends User)**
```java
+ freezeAccount(account: Account): void
``` 

### **Class: Account**

```java
- balance: Money  
- accountNumber: String  
+ getBalance(): Money  
+ debit(amount: Money): void  
+ credit(amount: Money): void
```

### **Class: Money**

```java
- amount: double  
- currency: String  
+ add(other: Money): Money  
+ subtract(other: Money): Money
```

