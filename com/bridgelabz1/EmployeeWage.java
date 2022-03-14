package com.bridgelabz1;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        //declaration
        int isPresent = 1;
        int isPartTime=2;
        int isAbsent = 0;
        int wagePerHour= 20;
        int fullTime= 8;
        int partTime=4;
        int empwage = 0;
        int Attendance = 0;

        //method
        int isPresence = (int) (Math.random() * 10) % 3;
        //System.out.println(isPresence);

        if (isPresence == isPresent) {
            empwage =  wagePerHour * fullTime;
        }else if(isPresence == isPartTime){

            empwage = wagePerHour * partTime;
        }else{
            empwage= 0;
        }
        System.out.println("Employee wage : "+empwage);
    }
}
