package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int counter = 0;

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                counter++;
            }
        }
        if(counter == 0)
        {
            System.out.print("Prime Number!");
        }
        else{
            System.out.print("Not a Prime Number!");
        }
    }
}
