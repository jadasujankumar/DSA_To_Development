package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class AllDivisorsOfNumber_EfficientSolution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int i;

        for(i=1;i<Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                System.out.print(i+" ");
            }
        }
        for( ; i>=1; i--)
        {
            if(num%i == 0)
            {
                System.out.print(num/i+" ");
            }
        }
    }
}
