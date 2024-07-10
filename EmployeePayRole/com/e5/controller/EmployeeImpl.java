package com.e5.controller;

import com.e5.service.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.e5.dao.EmployeeDataBase;
import com.e5.others.CustomException;

public class EmployeeImpl implements Employee {

    Service service = new ServiceImpl();
    Scanner scanner = new Scanner(System.in);
    EmployeeDataBase loginDetails = new EmployeeDataBase();
    EmployeeDataBase employeeDataBase = new EmployeeDataBase();
    CustomException customException=new CustomException();


    boolean validation, flag = false;

    public EmployeeDataBase launch(boolean creatAdmin) {
        try {
            if ( creatAdmin){
                createAdmine();
            }
            EmployeeDataBase employeeDataBase = login();
            if (employeeDataBase == null) {
                return null;
            } else {
                return employeeDataBase;
            }
        } catch (Exception e) {
           customException.errorWhileLaunching(e);

        }
     return null;
    }

    public EmployeeDataBase login() {
        boolean flag = false;
        print("Welcome to My - HRMS");
        print();
        System.out.print("User Name : ");
        String userName = scanner.nextLine();
try {
    do {
        System.out.print("Password : ");
        String password = scanner.nextLine();
        if (userName.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {
            userName = "Admin";
            loginDetails = service.searchEmployeeDetals(userName);
            return loginDetails;
        }
        loginDetails = service.searchEmployeeDetals(userName);
        if (loginDetails == null) {
            print("Invalid username. Please contact the Admin to create the employee account.");
            print();
        } else if (loginDetails.getPassword().equals(password)) {
            print("Logged in successfully ");
            print();
            flag = false;
        } else {
            print("Invalid Password");
            loginDetails = new EmployeeDataBase();
            flag = true;
        }
    } while (flag);
} catch (Exception e) {
   customException.errorWhileLogin(e);
}
      
        return loginDetails;
    }

    public void createAdmine() {
        boolean flag = false;
        try {
            do {
                String name = "Praveenraj Sivaraja";
                String userName = "Admin";
                String password = "Admin";
                String age = "27";
                String gender = "M";
                String dateOfBirth = "22/10/1997";
                String role = "Admin";
                String createdBy = "Admin";
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                String onboardedOn = formatter.format(date);
                print();
                employeeDataBase = service.addEmployeeDetails(name, age, gender, dateOfBirth, role, userName, password,
                        createdBy, onboardedOn);
                if (employeeDataBase == null) {
                    print("Failed to create the user ");
                }
            } while (flag);
      
        } catch (Exception e) {
          customException.errorWhileAddEmployeeDetails(e);
        }
        
    }

    public String adminPrivileges() throws Exception {
         AdminImpl admin = new AdminImpl();
        try {
            String input = admin.privileges();
            if (input.equals("1")) {
                createNewEmployee();
    
            } else if (input.equals("2")) {
                viewEmployeeDetails();
    
            } else if (input.equals("3")) {
                searchEmployee();
    
            } else if (input.equals("4")) {
                print("Displaying Employee Detals details With Similar Match ");
                searchEmployeeByDetails();
    
            } else if (input.equals("5")) {
                deleteEmployeeDetails();
    
            } else if (input.equals("6")) {
                updateEmployeeDetails();
    
            } else if (input.equals("7")) {
                logout();
                return "logout";
            } else {
                return "stop";
            }
        } catch (Exception e) {
           customException.errorWhileExecutingAdminPrivilages(e);
        }
      
        return "";
    }

    public String devPrivileges() throws Exception {
        try {
            Developer dev = new Developer();
            String input = dev.privileges();
            if (input.equals("1")) {
                createNewEmployee();
    
            } else if (input.equals("2")) {
                viewEmployeeDetails();
    
            } else if (input.equals("3")) {
                searchEmployee();
    
            } else if (input.equals("4")) {
                print("Displaying Employee Detals details With Similar Match ");
                searchEmployeeByDetails();
    
            } else if (input.equals("5")) {
                updateEmployeeDetails();
    
            } else if (input.equals("6")) {
                logout();
                return "logout";
            } else {
                return "stop";
            }
        } catch (Exception e) {
            customException.errorWhileExecutingDevPrivilages(e);
        }
      
        return "";
    }

    public String qaPrivileges() throws Exception {
        try {
            QualityAnalyst qa = new QualityAnalyst();
            String input = qa.privileges();
            if (input.equals("1")) {
                viewEmployeeDetails();
    
            } else if (input.equals("2")) {
                searchEmployee();
    
            } else if (input.equals("3")) {
                print("Displaying Employee Detals details With Similar Match ");
                searchEmployeeByDetails();
    
            } else if (input.equals("4")) {
                logout();
                return "logout";
            } else {
                return "stop";
            }
        } catch (Exception e) {
            customException.errorWhileExecutingQaPrivilages(e);
        }
       
        return "";
    }

    public void createNewEmployee() {
try {
    do {
        EmployeeDataBase employeeDataBase;
        String name, age, gender, dateOfBirth, role, userName, password, createdBy, onboardedOn;

        name = getInput("Name : ");
        do {
            userName = getInput("User Name : ");
            employeeDataBase = service.searchEmployeeDetals(userName);
            if (employeeDataBase != null) {
                print("Employee : " + userName + " alreayd exist");
            }
        } while (employeeDataBase != null);

        password = getInput("Password : ");
        age = getInput("Age : ");
        gender = getInput("Gender : ");
        dateOfBirth = getInput("Date Of Birth : ");
        role = getInput("Role : ");
        createdBy = this.loginDetails.getUserName();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        onboardedOn = formatter.format(date);

        employeeDataBase = service.addEmployeeDetails(name, age, gender, dateOfBirth, role, userName, password,
                createdBy, onboardedOn);
        if (employeeDataBase == null) {
            print("Failed to create the user ");
        }
        System.out
                .println("Employee Id " + employeeDataBase.getEmpId() + " has been Created Successfully");
        print();
        flag = retry();

    } while (flag);

} catch (Exception e) {
customException.errorWhileAddEmployeeDetails(e);}
       
    }

    public void deleteEmployeeDetails() {
        String uniqueId;
try {
    do {

        do {
            print("Enter the Unique Id to be Deleted");
            uniqueId = scanner.nextLine();
            print();
            validation = service.validateInput(uniqueId, "Unique Id");
        } while (validation);

        try {
            boolean status = service.deleteEmployeeDetails(Integer.parseInt(uniqueId));
            if (status) {
                print("Employee Id " + uniqueId + " has been Delted Successfully");
            } else {
                print("Employee Id " + uniqueId + " not deleted ");
            }
            flag = retry();

        } catch (Exception e) {
            print("Invalid Employee Id");
            flag = true;
        }
    } while (flag);

} catch (Exception e) {
    customException.errorWhileDeleteEmployeeDetails(e);;
}
        }

    public void updateEmployeeDetails() {
      try {
        do {

            String uniqueId = "", name = "", gender = "", age = "", dateOfBirth = "", input = "", role = "",
                    password = "";

            do {
                print("Enter the Unique Id to Updated");
                uniqueId = scanner.nextLine();
                validation = service.validateInput(uniqueId, "Employee ID");
            } while (validation);

            EmployeeDataBase employeeDetails = service.searchEmployeeDetals(uniqueId);

            if (employeeDetails == null) {
                print("Employee Details Not exist");
                print();
            } else {
                if (employeeDetails.getEmpId().equals(uniqueId)) {
                    print("Name : " + employeeDetails.getName());
                    print("Press y to update the Name ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the updated Name : ");
                        name = scanner.nextLine();
                        flag = service.validateInput(name, "Name");
                    }
                    print("Password : *****");
                    print("Press y to new the Password  ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the new Password : ");
                        password = scanner.nextLine();
                        flag = service.validateInput(password, "Password");
                    }
                    print("Age : " + employeeDetails.getAge());
                    print("Press y to update the Age ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the updated Age : ");
                        age = scanner.nextLine();
                        flag = service.validateInput(age, "Age");
                    }

                    print("Gender : " + employeeDetails.getSex());
                    print("Press y to update the Gender ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the updated Gender : ");
                        gender = scanner.nextLine();
                        flag = service.validateInput(gender, "Gender");
                    }

                    print("Date Of Birth : " + employeeDetails.getDateOfBirth());
                    print("Press y to update the Date Of Birth  ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the updated Date Of Birth : ");
                        dateOfBirth = scanner.nextLine();
                        flag = service.validateInput(dateOfBirth, "Date Of Birth");
                    }

                    print("Role : " + employeeDetails.getRole());
                    print("Press y to update the Role  ");
                    input = scanner.nextLine();
                    if (input.equals("y")) {
                        print("Entre the upated Role : ");
                        role = scanner.nextLine();
                        flag = service.validateInput(role, "Role");
                    }

                    boolean status = service.updateEmployeeDetails(uniqueId, name, age, dateOfBirth, gender, role,
                            password);

                    if (status) {
                        print("Employee has been Updated successfuly");
                    } else {
                        print("Failed to update the employee details");
                    }
                }
                print("Total number of Employee = " + employeeDetails.getEmpId());
            }
            flag = retry();
        } while (flag);
    
      } catch (Exception e) {
       customException.errorWhileUpdateEmployeeDetails(e);
      }
    }

    public void viewEmployeeDetails() {
try {
    ArrayList<EmployeeDataBase> employeeDataBaseList = service.getAllEmployeeDetails();
    int totalEmployee = employeeDataBaseList.size();
    if (employeeDataBaseList != null && employeeDataBaseList.size() > 0) {
        print("Displaying All Employee Details");
        for (EmployeeDataBase employeeDataDetails : employeeDataBaseList) {
            if (!loginDetails.getRole().toLowerCase().equals("admin")
                    && employeeDataDetails.getRole().toLowerCase().equals("admin")) {
                --totalEmployee;
            } else {
                displayEmployeeDetails(employeeDataDetails);
            }
        }
        print("Total number of Employee = " + totalEmployee);
    } else {
        print("No Employee Details Exist to Display");
    }
} catch (Exception e) {
  customException.errorWhileGettingEmployeeDetails(e);
}
       
    }

    public void displayEmployeeDetails(EmployeeDataBase employeeDataBase) {
        try {
            print("--------------------");
            print("Employee ID : " + employeeDataBase.getEmpId());
            print("Name : " + employeeDataBase.getName());
            print("User Name : " + employeeDataBase.getUserName());
            print("Role : " + employeeDataBase.getRole());
            print("Age : " + employeeDataBase.getAge());
            print("Date Of Birth : " + employeeDataBase.getDateOfBirth());
            print("Gender : " + employeeDataBase.getSex());
            if (loginDetails.getRole().toLowerCase().equals("admin")
                    || (loginDetails.getRole().toLowerCase().equals("manager"))) {
                print("Password  : " + employeeDataBase.getPassword());
                print("Created by  : " + employeeDataBase.getCreatedBy());
                print("Onboarded On  : " + employeeDataBase.getOnboardedOn());
            }
            print("--------------------");
        } catch (Exception e) {
           customException.errorWhileDisplayingTheEmployeeDetails(e);
        }
       
    }

    public EmployeeDataBase searchEmployee() {
        boolean validation, flag = false;
        employeeDataBase = new EmployeeDataBase();
        try {
            do {
                String uniqueId;
                do {
                    print("Enter the Unique Id to Search");
                    uniqueId = scanner.nextLine();
                    validation = service.validateInput(uniqueId, "Unique Id");
                } while (validation);
    
                employeeDataBase = service.searchEmployeeDetals(uniqueId);
                if (employeeDataBase == null) {
                    print("Employee Details Not exist");
                    print();
                } else {
                    print();
                    print("Displaying Employee Detals for the Unique Id : " + uniqueId);
                    displayEmployeeDetails(employeeDataBase);
                }
                int totalEmployeeCount = service.getTotalEmployeeNumber();
                if (totalEmployeeCount > 0) {
                    print("Total number of Employee = " + totalEmployeeCount);
                } else {
                    print("Employee Details Not Found ");
                }
    
                flag = retry();
    
            } while (flag);
           
        } catch (Exception e) {
            customException.errorWhileSearchEmployeeDetals(e);
        }
        return employeeDataBase;
    }

    public void searchEmployeeByDetails() {
        boolean validation, flag = false;
        try {
            do {
                String searchEmployee;
                do {
                    print("Enter the Employee Detail to Search");
                    searchEmployee = scanner.nextLine();
                    validation = service.validateInput(searchEmployee, "Unique Id");
                } while (validation);
    
                employeeDataBase = service.elastickSearchForEmployeeDetals(searchEmployee);
                if (employeeDataBase == null) {
                    print("Employee Details Not exist");
                    print();
                } else {
                    print();
                    System.out
                            .println("Displaying Employee Detals for the Employee Id : " + employeeDataBase.getEmpId());
                    displayEmployeeDetails(employeeDataBase);
                }
                int totalEmployeeCount = service.getTotalEmployeeNumber();
                if (totalEmployeeCount > 0) {
                    print("Total number of Employee = " + totalEmployeeCount);
                } else {
                    print("Employee Details Not Found ");
                }
    
                flag = retry();
            } while (flag);
       
        } catch (Exception e) {
          customException.errorWhileSearchEmployeeDetals(e);
        }
       }

    public String getInput(String key) {
        String input = "";
        boolean flag = false;
        try {
            do {
                System.out.print(key);
                input = scanner.nextLine();
                flag = service.validateInput(input, key);
    
            } while (flag);
        } catch (Exception e) {
           customException.errorWhileGettingInputFromUser(e);
        }
       
        return input;
    }

    public boolean retry() {
        String input;
        boolean flag = false;
        try {
            do {
                print();
                print("press y to repeat ");
                input = scanner.nextLine();
                flag = service.validateInput(input, "");
            } while (flag);
            if (input.toLowerCase().equals("y")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            customException.errorWhileGettingInputFromUser(e);
        }
       return false;

    }

    public void print() {
        System.out.println();
    }

    public void print(String input) {
        System.out.println(input);
    }

    public void logout() {
        loginDetails = null;

    }
}