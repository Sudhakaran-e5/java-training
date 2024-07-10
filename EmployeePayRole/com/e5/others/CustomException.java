package com.e5.others;

public class CustomException extends Exception {
    public void errorWhileExecution(Exception e) {
        System.err.println(e);
        System.err.println("Error while Executing ");
    }

    public void errorWhileUpdateEmployeeDetails(Exception e) {
        System.err.println(e);
        System.err.println("Error While Updating the Employee Details ");
    }

    public void errorWhileSearchEmployeeDetals(Exception e) {
        System.err.println(e);
        System.err.println("Error while Searching the mployee Details ");
    }

    public void errorWhileGettingEmployeeDetails(Exception e) {
        System.err.println(e);
        System.err.println("Error while Get Employee Details ");
    }

    public void errorWhileAddEmployeeDetails(Exception e) {
        System.err.println(e);
        System.err.println("Error while Add Employee Details ");
    }

    public void errorWhileDisplayingTheEmployeeDetails(Exception e) {
        System.err.println(e);
        System.err.println("Error while Displaying The Employee Details ");
    }

    public void errorWhileDeleteEmployeeDetails(Exception e) {
        System.err.println(e);
        System.err.println("Error while Add Employee Details ");
    }

    public void errorWhileConvertingList(Exception e) {
        System.err.println(e);
        System.err.println("Error while Converting the Employee details ");
    }

    public void errorWhileWritingIntoTheTextfile(Exception e) {
        System.err.println(e);
        System.err.println("Error while Writing the Employee Details in the Local Text ");
    }

    public void errorWhileExecutingQaPrivilages(Exception e)  {
        System.err.println(e);
        System.err.println("Error while Executing the QA Privilages ");
        throw new UnsupportedOperationException("Error while Executing the QA Privilages");
    }
    public void errorWhileExecutingDevPrivilages(Exception e)  {
        System.err.println(e);
        System.err.println("Error while Executing the Dev Privilages ");
        throw new UnsupportedOperationException("Error while Executing the Dev Privilages");
    }
    public void errorWhileExecutingAdminPrivilages(Exception e){
        System.err.println(e);
        System.err.println("Error while Executing the Admin Privilages ");
        throw new UnsupportedOperationException("Error while Executing the Admin Privilages");
    }

    public void errorWhileLaunching(Exception e) {
        System.err.println(e);
        throw new UnsupportedOperationException("UnExpected Error While Launching the Appication");
    }

    public void errorWhileLogin(Exception e) {
        System.err.println(e);
        throw new UnsupportedOperationException("UnExpected Error While Logging Into The Applicatio ");
    }

    public void errorWhileGettingInputFromUser(Exception e) {
        System.err.println(e);
        throw new UnsupportedOperationException("UnExpected Error While Getting The Input From The User");
    }

   

   

  
}
