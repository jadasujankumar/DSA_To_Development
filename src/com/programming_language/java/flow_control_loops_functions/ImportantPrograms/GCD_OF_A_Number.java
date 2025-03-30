package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class GCD_OF_A_Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        int min = Math.min(num1,num2);

        int GCD = 1;

        for (int i=1;i<=min;i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                GCD = i;
            }
        }
        System.out.println("GCD of a number is : "+GCD);
    }
}
