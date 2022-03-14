package com.bridgelabz1;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        //declaration
        int isPresent = 1;
        int isAbsent = 0;

        //method
        int isPresence = (int) (Math.random() * 2);
        //System.out.println(isPresence);

        if (isPresence == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");

        }
    }
}
