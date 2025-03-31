package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class Fibonacci_Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = input.nextInt();

        int a =1,b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i =2;i<=n;i++)
        {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
