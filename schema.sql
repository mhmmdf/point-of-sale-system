-- Point of Sale System Database Schema
-- Database: pos_db

CREATE DATABASE IF NOT EXISTS pos_db;
USE pos_db;

-- Users table (login)
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('admin', 'cashier') DEFAULT 'cashier',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Items (master barang)
CREATE TABLE IF NOT EXISTS items (
    code VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    purchase_price DECIMAL(12,2) NOT NULL DEFAULT 0,
    selling_price DECIMAL(12,2) NOT NULL DEFAULT 0,
    stock INT NOT NULL DEFAULT 0,
    equity DECIMAL(15,2) NOT NULL DEFAULT 0
);

-- Customers (pelanggan)
CREATE TABLE IF NOT EXISTS customers (
    id_number VARCHAR(50) PRIMARY KEY,
    id_type ENUM('KTP', 'SIM', 'PASSPORT') DEFAULT 'KTP',
    name VARCHAR(255) NOT NULL,
    address TEXT,
    gender ENUM('Male', 'Female') DEFAULT 'Male',
    phone VARCHAR(50),
    registration_date DATE
);

-- Suppliers (supplier)
CREATE TABLE IF NOT EXISTS suppliers (
    code VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address TEXT,
    phone VARCHAR(50)
);

-- Sales (penjualan)
CREATE TABLE IF NOT EXISTS sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_code VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    total DECIMAL(12,2) NOT NULL,
    sale_date DATE NOT NULL,
    profit DECIMAL(12,2) NOT NULL DEFAULT 0,
    FOREIGN KEY (item_code) REFERENCES items(code) ON DELETE CASCADE
);

-- Purchase orders (orders / pembelian)
CREATE TABLE IF NOT EXISTS purchase_orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_number VARCHAR(50) NOT NULL,
    item_code VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    order_date DATE NOT NULL,
    supplier_code VARCHAR(50),
    FOREIGN KEY (item_code) REFERENCES items(code) ON DELETE CASCADE,
    FOREIGN KEY (supplier_code) REFERENCES suppliers(code) ON DELETE SET NULL
);

-- Insert default admin user (password: admin)
INSERT INTO users (username, password) VALUES ('admin', 'admin');
