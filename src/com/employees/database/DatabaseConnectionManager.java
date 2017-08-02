package com.employees.database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class DatabaseConnectionManager {
    private Connection connection;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {

    }

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Some/URL");
        System.out.println("Connected to database...");
    }
    public Connection getConnectionObject(){
        return connection;
    }
    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from database...");
    }
}
