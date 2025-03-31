package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class Naive_Solution_All_Divisiors_Of_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.print("Divisors of number "+num+" are ");
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
