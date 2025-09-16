# 🏦 Bank Management System (Java + JDBC + MySQL)

A simple **console-based Java project** that demonstrates how to use **JDBC** to perform **CRUD operations** (Create, Read, Update, Delete) on a MySQL database.  

This project is great for **beginners learning JDBC, DAO pattern, and database connectivity** in Java.  

---

## ✨ Features
- ➕ Add new customer  
- 📋 View all customers  
- 💰 Update customer balance  
- 🗑 Delete customer by account ID  
- 👨‍💻 Console-based interactive menu  

---

## ⚙️ Tech Stack
- **Java (JDK 17+)**
- **JDBC**
- **MySQL Database**
- **DAO Design Pattern**

---

## 📂 Project Structure 

        BankManagementJDBC/
        ├── src/
        │ ├── Bankk/
        │ │ ├── DAO.java # Customer entity class
        │ │ ├── CustomerDAO.java # Handles database CRUD operations
        │ │ └── BankManagement.java # Main console app (menu-driven)
        ├── lib/
        │ └── mysql-connector-j-8.3.0.jar # MySQL JDBC driver
        ├── db.sql # SQL script for database & table setup
        └── README.md