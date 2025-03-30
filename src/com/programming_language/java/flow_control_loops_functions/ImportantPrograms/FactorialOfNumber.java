package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int n = num;

        long factorial = 1;

        while(n>0)
        {
            factorial = n*factorial;
            n--;
        }
        System.out.println("Factorial of a number "+num+" is : "+factorial);
    }
}
