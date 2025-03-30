package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = input.nextInt();

        int counter = 0;

        while(number > 0)
        {
            number = number / 10;
            counter ++;
        }
        System.out.println("No Of Digits = "+counter);
    }
}
