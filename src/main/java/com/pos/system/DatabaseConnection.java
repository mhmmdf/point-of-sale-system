package com.pos.system;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static Connection connection;
    private static String reportPath;

    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader()
                .getResourceAsStream("db.properties")) {
            Properties props = new Properties();
            if (input != null) {
                props.load(input);
            }
            String host = props.getProperty("db.host", "localhost");
            String port = props.getProperty("db.port", "3306");
            String name = props.getProperty("db.name", "pos_db");
            String user = props.getProperty("db.user", "root");
            String password = props.getProperty("db.password", "");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + name;
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.err.println("Failed to initialize database connection: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            throw new RuntimeException("Database connection is not initialized. Check db.properties.");
        }
        return connection;
    }

    public static String getReportPath() {
        return reportPath;
    }

    public static void setReportPath(String path) {
        reportPath = path;
    }
}
