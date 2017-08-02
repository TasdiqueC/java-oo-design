package com.employees.reporting;

import com.employees.domain.Employee;
import com.employees.reporting.ReportFormatter;

import java.text.Format;

/**
 * Created by TasdiqueC on 7/28/17.
 */
public class EmployeeReportFormatter extends ReportFormatter {
    Employee anEmployee;

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);

    }
    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
