package com.programming_language.java.introduction_variable_operators;

import java.io.*;

public class BufferedReaderImplementation {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        System.out.print("Enter the Employee Id : ");
        int employeeId = Integer.parseInt(br.readLine());

        System.out.print("Enter the name of the Employee :");
        String name = br.readLine();

        System.out.print("Enter the age of the Employee : ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Employee Id : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("age : "+age);

    }
}
