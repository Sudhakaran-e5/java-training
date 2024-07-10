package com.e5.service;
import com.e5.dao.EmployeeDataBase;

import java.util.ArrayList;

public interface Service {
        public EmployeeDataBase addEmployeeDetails(String name,
                        String age, String gender, String dateOfBirth, String role, String userName, String password, String createdBy, String onboardedOn);

        public ArrayList<EmployeeDataBase> getAllEmployeeDetails();

        public EmployeeDataBase searchEmployeeDetals(String uniqueId);

        public EmployeeDataBase elastickSearchForEmployeeDetals(String input);

        public boolean updateEmployeeDetails(String uniqueId, String name, String age,
                        String dateOfBirth, String gender, String role, String password);

        public boolean deleteEmployeeDetails(int uniqueId);

        public boolean validateInput(String input, String Key);

        public int getTotalEmployeeNumber();
}