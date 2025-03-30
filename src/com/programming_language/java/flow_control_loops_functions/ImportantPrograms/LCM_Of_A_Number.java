package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class LCM_Of_A_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the number2 : ");
        int num2 = input.nextInt();

        int Lcm = 1;

        int max = Math.max(num1,num2);

        int n = num1*num2;

        for(int i=max;i<=n;i++)
        {
           if(i%num1 == 0 && i%num2==0)
           {
               Lcm = i;
               break;
           }
        }

        System.out.printf("Lcm of %d and %d is %d",num1,num2,Lcm);
    }
}
