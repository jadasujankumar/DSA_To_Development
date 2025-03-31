package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class PrimeNumber_MostOptimizedSolution {

    static boolean isPrime(int num)
    {
        if(num==1)
            return false;
        if(num==2 || num==3)
        {
            return true;
        }
        if(num%2 == 0 || num%3==0)
        {
            return false;
        }
        else{
            for(int i = 5; i<=Math.sqrt(num);i=i+6)
            {
                if(num%i == 0 || num%(i+2)==0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.print(isPrime(num));
    }
}
