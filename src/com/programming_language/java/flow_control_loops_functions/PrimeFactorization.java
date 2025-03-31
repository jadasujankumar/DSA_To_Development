package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class PrimeFactorization {

    static boolean isPrime(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    static void printFactors(int num)
    {
        for(int i=2;i<=num; i++)
        {
            int x = i;
            if(isPrime(i))
            {
                while(num%x==0)
                {
                    System.out.print(i+" ");
                    x = x*i;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        printFactors(num);

    }
}
