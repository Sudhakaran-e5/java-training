package com.e5.controller;

import com.e5.others.CustomException;

public class Developer extends EmployeeImpl {
    boolean validation, flag = false;

    public String privileges() throws Exception {
        String input = "";
        try {
            print("Press 1 to Create an User");
        print("Press 2 to View the User");
        print("Press 3 to Search user by ID");
        print("Press 4 to Search by User Details");
        print("Press 5 to Update the User Details");
        print("Press 6 to Logout");
        print("Press any key to stop");
        print();
        
        boolean validation;
        do {
            input = scanner.nextLine();
            validation = service.validateInput(input, "Main Input");
        } while (validation);
        } catch (Exception e) {
           CustomException customException=new CustomException();
           customException.errorWhileExecutingDevPrivilages(e);
        }
        
        return input;
    }
}