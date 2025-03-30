package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        if(number%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
