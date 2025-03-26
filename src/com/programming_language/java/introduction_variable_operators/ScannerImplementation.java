package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class ScannerImplementation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee Id : ");
        int empId = input.nextInt();
        input.nextLine();

        System.out.print("Enter the employee name : ");
        String name = input.nextLine();


        System.out.print("Enter the age of the Employee : ");
        int age = input.nextInt();

        System.out.println("Employee Id : "+empId);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
