package com.programming_language.java.flow_control_loops_functions.ImportantPrograms.Patterns;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
