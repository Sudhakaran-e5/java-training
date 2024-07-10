package com.e5.controller;

import com.e5.dao.EmployeeDataBase;

public interface Employee {
    public EmployeeDataBase launch(boolean creatAdmin);

    public void createAdmine();

    public EmployeeDataBase login();

    public void viewEmployeeDetails();

    public void displayEmployeeDetails(EmployeeDataBase employeeDataBase);

    public EmployeeDataBase searchEmployee();

    public void searchEmployeeByDetails();

    public String getInput(String key);

    public boolean retry();

    public void print(String input);

    public void print();

    public void logout();

    public String adminPrivileges() throws Exception;

    public String devPrivileges() throws Exception;

    public String qaPrivileges() throws Exception;  

}
