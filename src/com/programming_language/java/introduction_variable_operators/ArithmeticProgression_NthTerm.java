package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class ArithmeticProgression_NthTerm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first term in arithmetic progression a : ");
        int a = input.nextInt();

        System.out.print("Enter the common difference d : ");
        int d = input.nextInt();

        System.out.print("Enter the Nth term that you want to find out : ");
        int n = input.nextInt();

        int NthTermInAp = a+(n-1)*d;

        System.out.println(NthTermInAp);
    }
}
