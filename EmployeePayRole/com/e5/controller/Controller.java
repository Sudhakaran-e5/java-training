package com.e5.controller;

import com.e5.dao.*;
import com.e5.others.CustomException;

public class Controller {

    public static void main(String args[]) {
        Employee employee = new EmployeeImpl();
        try {
            String role="", session = "";
            main: do {
                EmployeeDataBase employeeDataBase = employee.launch((role=="") ? true:false);
                role = (employeeDataBase != null) ? employeeDataBase.getRole() : null;
                do {
                    if (role == null || role.isEmpty() || role.isBlank()) {
                        employee.logout();
                        break;
                    } else if (role.toLowerCase().equals("admin")) {
                        session = employee.adminPrivileges();
                    } else if (role.toLowerCase().equals("dev")) {
                        session = employee.devPrivileges();
                    } else if (role.toLowerCase().equals("qa")) {
                        session = employee.qaPrivileges();
                    } else if (role.toLowerCase().equals("manager")) {
                        session = employee.adminPrivileges();
                    } else {
                        System.out.println(
                                "The Employee dosent have the previlages, Kinldy reachout to Admin for access ");
                    }
                    if (session.toLowerCase().equals("stop")) {
                        break main;
                    } else if (session.toLowerCase().equals("logout")) {
                        break;
                    } else {
                        continue;
                    }
                } while (true);
            } while (true);

        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileExecution(e);
        }
    }
}
