package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

import java.util.Scanner;

public class GeometricProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first term : ");
        int a = input.nextInt();

        System.out.print("Enter the second term : ");
        int b = input.nextInt();

        double r = (double) b/a;

        System.out.print("Enter the Nth term you want to find : ");
        int n = input.nextInt();

        double nth_Term = a*Math.pow(r,n-1);


        System.out.println("nth_Term of the GP is : "+(int)Math.floor(nth_Term));


    }
}
