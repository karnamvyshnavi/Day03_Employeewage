package com.bridgelabz1;

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

        switch(isPresence){
            case 1:
                empwage = wagePerHour * fullTime;
                break;
            case 2:
                empwage = wagePerHour * partTime;
                break;
            case 0:
                empwage = 0;
                break;
        }

        System.out.println("Employee wage : "+empwage);
    }
}
