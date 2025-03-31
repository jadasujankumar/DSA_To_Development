package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class SwitchPractice {

    public static void calculator(int a,int b, int operator)
    {
        switch (operator)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the num2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter the operation : \n 1.Add \n 2.subtract \n 3.multiply\n");

        System.out.print("Enter the operator : ");
        int operator = input.nextInt();

        calculator(num1,num2,operator);
    }
}
