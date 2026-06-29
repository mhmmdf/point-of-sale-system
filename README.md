# Point of Sale System

A Java Swing-based desktop Point of Sale application with MySQL database and JasperReports integration.

## Features

- **Login System** - Secure authentication
- **Master Data Management**
  - Items (products) with purchase/selling prices and stock tracking
  - Customers with identity and contact information
  - Suppliers with contact details
- **Transactions**
  - Purchase orders (stock intake from suppliers)
  - Sales with automatic stock deduction and profit calculation
- **Reports** - JasperReports-based item reports

## Tech Stack

- **Language:** Java 11+
- **UI:** Java Swing (NetBeans GUI Builder)
- **Database:** MySQL
- **Reporting:** JasperReports
- **Build Tool:** Maven

## Prerequisites

- Java JDK 11 or higher
- MySQL Server 5.7+
- Apache Maven 3.6+

## Setup

### 1. Database

Run the schema file to create the database and tables:

```bash
mysql -u root -p < schema.sql
```

### 2. Configuration

Edit `db.properties` in `src/main/resources/` to match your MySQL setup:

```properties
db.host=localhost
db.port=3306
db.name=pos_db
db.user=root
db.password=your_password
```

### 3. Build & Run

```bash
# Build with Maven
mvn clean package

# Run the application
java -jar target/point-of-sale-system-2.0.0-jar-with-dependencies.jar
```

### Default Login

- **Username:** admin
- **Password:** admin

## Project Structure

```
src/
├── main/
│   ├── java/com/pos/system/
│   │   ├── DatabaseConnection.java   # Database connection manager
│   │   ├── LoginForm.java            # Login screen (entry point)
│   │   ├── MainMenu.java             # Main menu with navigation
│   │   ├── ItemForm.java             # Items/stock management
│   │   ├── CustomerForm.java         # Customer management
│   │   ├── SupplierForm.java         # Supplier management
│   │   ├── SalesForm.java            # Sales transactions
│   │   ├── PurchaseForm.java         # Purchase orders
│   │   └── ReportForm.java           # JasperReports viewer
│   └── resources/
│       ├── db.properties             # Database configuration
│       └── reports/                  # JasperReports templates
├── schema.sql                        # Database schema
└── pom.xml                           # Maven configuration
```

## License

MIT License - see LICENSE file for details.

## Author

**Muhammad Fikri Arsyah**

- GitHub: [@mhmmdf](https://github.com/mhmmdf)
