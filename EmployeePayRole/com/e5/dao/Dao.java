package com.e5.dao;

import java.util.ArrayList;

public interface Dao {
        public EmployeeDataBase addEmployeeDetails(String name,
                        String age, String gender, String dateOfBirth, String role, String userName, String password,
                        String createdBy, String onboardedOn);

        public ArrayList<EmployeeDataBase> getEmployeeDetails();

        public boolean deleteEmployeeDetails(int employeeId);

        public boolean updateEmployeeDetails(String uniqueId, String name, String age, String dateOfBirth,
                        String gender,
                        String role, String password);
}