package com.e5.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.FileOutputStream;
import com.e5.others.CustomException;

public class DaoImpl implements Dao {

    private ArrayList<EmployeeDataBase> employeeDataBaseList;
    CustomException customException = new CustomException();

    public DaoImpl() {
        employeeDataBaseList = new ArrayList<>();
    }

    public EmployeeDataBase addEmployeeDetails(String name,
            String age, String gender, String dateOfBirth, String role, String userName, String password,
            String createdBy, String onboardedOn) {
        try {
            EmployeeDataBase employeeDataBase = new EmployeeDataBase();
            employeeDataBase.EmployeeDataBase(name, age, gender, dateOfBirth,
                    Integer.toString(employeeDataBaseList.size()), role, userName, password, createdBy, onboardedOn);
            employeeDataBaseList.add(employeeDataBase);
            writeTextFile();
            return employeeDataBase;
        } catch (Exception e) {
            customException.errorWhileAddEmployeeDetails(e);
        }
        return null;
    }

    public ArrayList<EmployeeDataBase> getEmployeeDetails() {
        return employeeDataBaseList;
    }

    public boolean deleteEmployeeDetails(int employeeId) {
        try {
            employeeDataBaseList.remove(employeeId);
            return true;
        } catch (Exception e) {
            customException.errorWhileDeleteEmployeeDetails(e);
            return false;
        }
    }

    public boolean updateEmployeeDetails(String uniqueId, String name, String age, String dateOfBirth, String gender,
            String role, String password) {
        try {
            ArrayList<EmployeeDataBase> employeeDataBaseList = getEmployeeDetails();
            for (EmployeeDataBase empDetails : employeeDataBaseList) {
                if (empDetails.getEmpId().equals(uniqueId)) {

                    empDetails.setAge(((age.isEmpty() || age.isBlank() || age == null) ? empDetails.getAge() : age));
                    empDetails.setDateOfBirth(((dateOfBirth.isEmpty() || dateOfBirth.isBlank() || dateOfBirth == null)
                            ? empDetails.getDateOfBirth()
                            : dateOfBirth));
                    empDetails.setSex(
                            ((gender.isEmpty() || gender.isBlank() || gender == null) ? empDetails.getSex() : gender));
                    empDetails.setName(
                            ((name.isEmpty() || name.isBlank() || name == null) ? empDetails.getName() : name));
                    empDetails.setRole(
                            ((role.isEmpty() || role.isBlank() || role == null) ? empDetails.getRole() : role));
                    empDetails.setPassword(
                            ((password.isEmpty() || password.isBlank() || password == null) ? empDetails.getPassword()
                                    : password));
                    return true;
                }
            }
        } catch (Exception e) {
            customException.errorWhileDeleteEmployeeDetails(e);
        }
        return false;
    }

    public String listToStringConvertor() {
        String input = "";
        try {
            Map<String, String> map = new HashMap<>();
            for (EmployeeDataBase employeeDataBase : employeeDataBaseList) {
                map.put("EmpID : ", employeeDataBase.getEmpId());
                map.put("Name : ", employeeDataBase.getName());
                map.put("User Name : ", employeeDataBase.getUserName());
                map.put("Password : ", employeeDataBase.getPassword());
                map.put("Age : ", employeeDataBase.getAge());
                map.put("DOB : ", employeeDataBase.getDateOfBirth());
                map.put("Role : ", employeeDataBase.getRole());
                map.put("Gender : ", employeeDataBase.getSex());
                map.put("Created By : ", employeeDataBase.getCreatedBy());
                map.put("Onboarded On : ", employeeDataBase.getOnboardedOn());
                if (input.isBlank() || input.isEmpty()) {
                    input = map.toString();
                } else {
                    input = input + "\n" + map.toString();
                }
            }
        } catch (Exception e) {
        customException.errorWhileConvertingList(customException);
        }
       
        return input;
    }

    public void writeTextFile() {
        try {
            String currentDirectory = System.getProperty("user.dir");
            String currentFilePath=currentDirectory.replace("\\", "\\\\") + "\\com\\e5\\others\\Database.txt";
            FileOutputStream writeDetails = new FileOutputStream(currentFilePath);
            String input = listToStringConvertor();
            byte date[] = input.getBytes();
            writeDetails.write(date);
            writeDetails.close();
        } catch (Exception e) {
            customException.errorWhileWritingIntoTheTextfile(e);
        }
    }
}
