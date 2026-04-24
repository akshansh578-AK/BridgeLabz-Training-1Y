# Java JDBC CRUD Project

## Project Overview

This project demonstrates JDBC with MySQL using multiple beginner-friendly manager modules.
Each manager creates its own table (if not exists) and performs CRUD operations using `PreparedStatement`.

Package used in all files:

`com.gla.jdbc`

Source path:

`src/com/gla/jdbc`

## Files Included

- `DBConnection.java` - Central MySQL connection utility.
- `MainMenu.java` - Main entry point to open all manager menus.
- Manager classes:
  - `EmployeeManager`
  - `ProductManager`
  - `LibraryManager`
  - `CustomerManager`
  - `BankingManager`
  - `MovieManager`
  - `HospitalManager`
  - `VehicleManager`
  - `EnrollmentManager`
  - `MenuManager`
  - `GymManager`
  - `SalesManager`
  - `TaskManager`

## Database Setup (MySQL)

1. Install MySQL Server.
2. Open MySQL client and run:

```sql
CREATE DATABASE IF NOT EXISTS jdbc_db;
```

3. Ensure credentials in `DBConnection.java` are valid:

- URL: `jdbc:mysql://localhost:3306/jdbc_db`
- Username: `root`
- Password: `root`

4. Add MySQL JDBC Driver (`mysql-connector-j`) to your project classpath in VS Code.

## How to Compile and Run

From project folder `jdbc`:

```bash
javac -d out src/com/gla/jdbc/*.java
```

Run main menu:

```bash
java -cp out com.gla.jdbc.MainMenu
```

## JDBC Concepts Used

- `DriverManager.getConnection(...)` for opening a DB connection.
- `PreparedStatement` for safe parameterized SQL (prevents SQL injection).
- `execute()`, `executeUpdate()`, and `executeQuery()` based on operation type.
- `ResultSet` for reading query results.
- Try-with-resources to automatically close DB objects.
- Exception handling (`SQLException`) for graceful error messages.

## Learning Notes

- Each manager is independent and follows the same reusable pattern:
  1. Create table
  2. Insert
  3. Read
  4. Update
  5. Delete
- Input is taken using `Scanner` and validated for basic numeric/string errors.
