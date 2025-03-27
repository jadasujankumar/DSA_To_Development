package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class LastDigitOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number :");
        int number = input.nextInt();

        int temp = Math.abs(number);

        int lastDigit = temp%10;

        System.out.println("lastDigit = "+lastDigit);
    }
}
