package com.Bridgelabz.EmpWage;

public class EmployeeWage {

    public void CheckEmpWage(){
        //Constants
        int IS_FULL_TIME = 1;
        //Computation

        double empCheck = Math.floor(Math.random() * 10) % 2 ;

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    public static void main(String[] args) {
//        System.out.println("Welcome To Employee Wage Program");

        EmployeeWage ew = new EmployeeWage();
        ew.CheckEmpWage();
    }
}
