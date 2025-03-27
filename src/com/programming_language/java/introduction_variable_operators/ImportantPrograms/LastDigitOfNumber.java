package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

import java.util.Scanner;

public class LastDigitOfNumber {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int lastDigit = Math.abs(num % 10);
        System.out.println("Last Digit = "+lastDigit);
    }
}
