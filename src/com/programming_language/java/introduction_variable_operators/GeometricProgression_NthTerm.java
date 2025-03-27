package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class GeometricProgression_NthTerm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first term in Gp : ");
        int a = input.nextInt();

        System.out.print("Enter the common ratio of the Gp : ");
        int r = input.nextInt();

        System.out.print("Enter the Nth term you want to find in Gp : ");
        int n = input.nextInt();

        double nthTermInGp = (a*Math.pow(r,n-1));

        System.out.print(nthTermInGp);
    }
}
