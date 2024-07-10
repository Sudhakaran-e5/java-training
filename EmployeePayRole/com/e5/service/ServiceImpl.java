package com.e5.service;

import com.e5.dao.*;
import com.e5.others.CustomException;

import java.util.ArrayList;

public class ServiceImpl implements Service {
    Dao dao = new DaoImpl();

    public EmployeeDataBase addEmployeeDetails(String name,
            String age, String gender, String dateOfBirth, String role, String userName, String password,
            String createdBy, String onboardedOn) {
        try {

            EmployeeDataBase employeeDataBase = dao.addEmployeeDetails(name, age, gender, dateOfBirth, role, userName,
                    password, createdBy, onboardedOn);

            return employeeDataBase;
        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileAddEmployeeDetails(e);
        }
        return null;
    }

    public ArrayList<EmployeeDataBase> getAllEmployeeDetails() {
        try {
            ArrayList<EmployeeDataBase> employeeDataBaseList = dao.getEmployeeDetails();
            return employeeDataBaseList;
        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileGettingEmployeeDetails(e);
        }
        return null;
    }

    public EmployeeDataBase searchEmployeeDetals(String uniqueId) {
        try {
            ArrayList<EmployeeDataBase> employeeDataBaseList = dao.getEmployeeDetails();
            if (employeeDataBaseList == null) {
                return null;
            }

            for (EmployeeDataBase empDetails : employeeDataBaseList) {
                if (empDetails.getEmpId().equals(uniqueId) || empDetails.getUserName().equals(uniqueId)) {
                    return empDetails;
                }
            }
        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileSearchEmployeeDetals(e);
        }
        return null;
    }

    public EmployeeDataBase elastickSearchForEmployeeDetals(String input) {
        try {
            System.out.println();

            ArrayList<EmployeeDataBase> employeeDataBaseList = dao.getEmployeeDetails();

            if (employeeDataBaseList != null) {
                for (EmployeeDataBase empDetails : employeeDataBaseList) {
                    if (empDetails.getEmpId().contains(input) || empDetails.getName().contains(input)
                            || empDetails.getAge().contains(input) || empDetails.getDateOfBirth().contains(input)
                            || empDetails.getSex().contains(input) || empDetails.getRole().contains(input)
                            || empDetails.getUserName().contains(input)) {
                        return empDetails;
                    }
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileSearchEmployeeDetals(e);
        }
        return null;
    }

    public boolean updateEmployeeDetails(String uniqueId, String name, String age,
            String dateOfBirth, String gender, String role, String password) {
        try {
            boolean status = dao.updateEmployeeDetails(uniqueId, name, age, dateOfBirth, gender, role, password);

            return status;
        } catch (Exception e) {
            CustomException customException=new CustomException();
            customException.errorWhileUpdateEmployeeDetails(e);
        }
        return false;
    }

    public boolean deleteEmployeeDetails(int uniqueId) {
        boolean flag = false;
        try {

            flag = dao.deleteEmployeeDetails(uniqueId);

        } catch (Exception e) {
            System.out.println("Employee Not Exist ");
        }
        return flag;
    }

    public boolean validateInput(String input, String Key) {
        boolean flag = false;
        if (input == null || input.isEmpty()) {
            if (Key.isEmpty() || Key == null) {
                System.out.println("Input cannot be Empty ");
            } else {
                System.out.println(Key + " cannot be Empty ");
            }

            flag = true;
        }
        return flag;

    }

    public int getTotalEmployeeNumber() {
        ArrayList<EmployeeDataBase> employeeDataBaseList = dao.getEmployeeDetails();

        int totalEmployeeCount = 0;
        if (employeeDataBaseList != null) {
            totalEmployeeCount = employeeDataBaseList.size();
        }

        return totalEmployeeCount;
    }

}