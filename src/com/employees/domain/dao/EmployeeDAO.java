package com.employees.domain.dao;

import com.employees.domain.Employee;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class EmployeeDAO {
    public void saveEmployee (Employee emp) {
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into Employees_tbl");
//        connectionManager.disconnect();
        System.out.println("Saved to database " + emp);
    }
    public void deleteEmployee (Employee emp) {
        System.out.println("Deleted from database " + emp);
    }
}
