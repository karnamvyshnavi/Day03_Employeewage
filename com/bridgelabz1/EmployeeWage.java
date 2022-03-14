package com.bridgelabz1;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        //declaration
        int isPresent = 1;
        int isAbsent = 0;
        int wagePerHour= 20;
        int fullTime= 8;
        int empwage = 0;
        int Attendance = 0;

        //method
        int isPresence = (int) (Math.random() * 2);
        //System.out.println(isPresence);

        if (isPresence == isPresent) {
            Attendance = 1;
        }

        empwage = Attendance * wagePerHour*fullTime;
        System.out.println("Employee wage : "+empwage);
    }
}
