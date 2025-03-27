package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = input.nextInt();

        int sum = n*(n+1)/2;

        System.out.println("Sum = "+sum);


    }
}
