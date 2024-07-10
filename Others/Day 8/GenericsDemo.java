package com.demo;


class Employee<Role> {

    String name;
    int age;

    public void determineRole(Role role) {
        switch (role.toString()) {
            case "DEV" -> System.out.println("Role is Dev");
            case "QA" -> System.out.println("Role is Qa");
        }

    }

    public <S> void determineRoleInMethod(S role) {
        switch (role.toString()) {
            case "DEV" -> System.out.println("Role is Dev");
            case "QA" -> System.out.println("Role is Qa");
        }
    }
}

public class GenericsDemo {

    public static void main(String[] args) {
        Employee<String> employee = new Employee<>();

        //valid
        employee.determineRole("DEV");

        // invalid - results in error
        // employee.determineRole(1);

        // both valid - cause generics bound to method leve;
        employee.determineRoleInMethod("QA");
        employee.determineRoleInMethod(1);

        Employee<Integer> employee1 = new Employee<>();

        //valid
        employee1.determineRole(1);
        //invalid
        // employee1.determineRole("DEV");
    }
}
