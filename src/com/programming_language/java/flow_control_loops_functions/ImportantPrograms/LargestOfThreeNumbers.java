package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the number2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter the number3 : ");
        int num3 = input.nextInt();

        int ans1 = Math.max(num1,num2);
        int max = Math.max(ans1,num3);

        System.out.println(max);

        if(num1>=num2 && num1>=num3)
        {
            System.out.println("num1 is the Largest Number");
        } else if (num2>=num3) {
            System.out.println("Num2 is the Largest Number");
        }
        else{
            System.out.println("Num3 is the Largest Number");
        }
    }
}
