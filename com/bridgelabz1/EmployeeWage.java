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
        int empWage = 0;
        int totalWorkingDays= 20;
        int  totalEmployeeWage = 0;

        //method
        int isPresence = (int) (Math.random() * 10) % 3;

        for( int i=1;i<totalWorkingDays;i++) {
            if (isPresence == isPresent) {
                empWage = fullTime + wagePerHour;
            } else if (isPresence == isPartTime) {
                empWage = partTime + wagePerHour;
            } else {
                empWage = 0;
            }
        totalEmployeeWage = totalEmployeeWage + empWage;
        }

        System.out.println("Employee wage for a month is : "+totalEmployeeWage);
    }
}
