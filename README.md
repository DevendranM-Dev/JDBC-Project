# JDBC Project

## 📌 Project Overview

This project is a **Java JDBC-based application** developed to demonstrate how Java applications interact with a **MySQL database** using JDBC.

The project focuses on database connectivity, CRUD operations, SQL queries, `PreparedStatement`, `ResultSet`, and proper handling of database resources.

## 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* SQL
* Eclipse IDE
* Git & GitHub

## ✨ Features

* Connect Java application with MySQL database
* Insert records into the database
* Retrieve records from the database
* Update existing records
* Delete records
* Execute SQL queries using JDBC
* Use `PreparedStatement` for database operations
* Process database results using `ResultSet`
* Handle SQL exceptions

## 🏗️ Project Structure

```text
JDBC-Project
│
├── src
│   └── Java source files
│
├── JDBC Connection
│   └── Database connection code
│
├── DAO
│   └── Database operations
│
├── Model
│   └── Java model classes
│
└── README.md
```

> The exact package and class structure may vary depending on the implementation.

## 🔌 JDBC Connection Flow

```text
Java Application
       ↓
    JDBC API
       ↓
 JDBC Driver
       ↓
    MySQL
       ↓
    Database
```

## 🔄 CRUD Operations

### Create

Insert new records into the database.

```sql
INSERT INTO table_name (...) VALUES (...);
```

### Read

Retrieve records from the database.

```sql
SELECT * FROM table_name;
```

### Update

Modify existing records.

```sql
UPDATE table_name
SET column_name = ?
WHERE id = ?;
```

### Delete

Remove records from the database.

```sql
DELETE FROM table_name
WHERE id = ?;
```

## 💡 JDBC Concepts Demonstrated

This project demonstrates the following JDBC concepts:

* `DriverManager`
* `Connection`
* `PreparedStatement`
* `Statement`
* `ResultSet`
* `SQLException`
* CRUD operations
* SQL queries
* Database connection management

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/DevendranM-Dev/JDBC-Project.git
```

### 2. Open the project

Open the project in **Eclipse IDE** or another Java IDE.

### 3. Configure MySQL

Create the required MySQL database and tables.

Update your database connection details in the JDBC connection class:

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String username = "root";
String password = "your_password";
```

### 4. Add MySQL JDBC Driver

Make sure the **MySQL Connector/J** driver is available in the project classpath.

### 5. Run the application

Run the required Java main class and perform the available database operations.

## 🎯 Learning Outcomes

Through this project, I practiced:

* Java database connectivity
* Writing SQL queries
* CRUD operations
* JDBC architecture
* Exception handling
* `PreparedStatement`
* Working with relational databases
* Connecting Java applications with MySQL

## 👨‍💻 Author

**Devendran M**

GitHub:
https://github.com/DevendranM-Dev

## 🔗 Repository

[JDBC-Project](https://github.com/DevendranM-Dev/JDBC-Project/tree/main)
