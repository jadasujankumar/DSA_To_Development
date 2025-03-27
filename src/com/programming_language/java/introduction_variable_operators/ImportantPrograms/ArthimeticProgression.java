package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

import java.util.Scanner;

public class ArthimeticProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first term : ");
        int a = input.nextInt();

        System.out.print("Enter the common difference : ");
        int d = input.nextInt();

        System.out.print("Enter the nth term you want to find :");
        int n = input.nextInt();

        int nth_term = a+(n-1)*d;

        System.out.println("Nth term is :"+nth_term);
    }
}
