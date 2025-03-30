package com.programming_language.java.flow_control_loops_functions;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select An Operation : ");
        System.out.println("1. Addition");
        System.out.print("2. Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.print("Select an Operation from the above options : ");
        int operation = input.nextInt();

        System.out.print("Enter the number1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the number2 : ");
        int num2 = input.nextInt();

        switch (operation)
        {
            case 1:
                System.out.println("Sum = "+(num1+num2));
                break;
            case 2:
                System.out.println("Sub = "+(num1 - num2));
                break;
            case 3:
                System.out.println("Mul = "+(num1 * num2));
                break;
            case 4:
                System.out.println("Div = "+(double)num1/num2);
                break;
            default :
                System.out.println("Invalid Operation Entered");
        }


    }
}
