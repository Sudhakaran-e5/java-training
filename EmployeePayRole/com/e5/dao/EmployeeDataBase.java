package com.e5.dao;
public class EmployeeDataBase {
    private String name;
    private String age;
    private String sex;
    private String dateOfBirth;
    private String empId;
    private String role;
    private String userName;
    private String password;
    private String createdBy;
    private String onboardedOn;
 
    public void EmployeeDataBase() {
        name = "";
        age = "";
        sex = "";
        dateOfBirth = "";
        empId = "";
        role = "";
        userName="";
        password="";
        createdBy="";
        onboardedOn="";
    }

    public void EmployeeDataBase(String name, String age, String sex, String dateOfBirth, String empId, String role, String userName, String password, String createdBy, String onboardedOn) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.empId = empId;
        this.role=role;
        this.userName=userName;
        this.password=password;
        this.createdBy=createdBy;
        this.onboardedOn=onboardedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public void seCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setOnboardedOn(String onboardedOn) {
        this.onboardedOn = onboardedOn;
    }
    
    public String getOnboardedOn() {
        return onboardedOn;
    }
}
