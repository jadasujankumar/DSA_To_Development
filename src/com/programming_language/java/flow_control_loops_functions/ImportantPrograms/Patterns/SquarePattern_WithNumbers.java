package com.programming_language.java.flow_control_loops_functions.ImportantPrograms.Patterns;

import java.util.Scanner;

public class SquarePattern_WithNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
