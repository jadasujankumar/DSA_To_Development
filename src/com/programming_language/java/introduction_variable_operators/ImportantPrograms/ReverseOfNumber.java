package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int lastDigit = 0;
        int reverseNumber = 0;

        while(num>0)
        {
            lastDigit = num%10;

            reverseNumber = reverseNumber * 10 +lastDigit;

            num = num/10;
        }

        System.out.println("Reverse number is "+reverseNumber);
    }
}
