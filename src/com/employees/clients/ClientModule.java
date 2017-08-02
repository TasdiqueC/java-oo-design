package com.employees.clients;

import com.employees.domain.Employee;
import com.employees.domain.dao.EmployeeDAO;
import com.employees.reporting.EmployeeReportFormatter;
import com.employees.reporting.FormatType;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class ClientModule {
    public static void main(String args[]) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
    }
    public static void terminateEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }
    public static void printEmployeeReport(Employee emp, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
        formatter.getFormattedEmployee();
    }
}
