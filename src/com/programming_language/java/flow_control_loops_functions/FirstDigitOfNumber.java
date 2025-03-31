package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class FirstDigitOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number ");
        int num = input.nextInt();

        while(num > 10)
        {
            num = num/10;
        }
        System.out.print("First Digit : "+num);
    }
}
