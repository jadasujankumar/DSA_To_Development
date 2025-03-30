package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class Nested_If_Else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num == 0)
        {
            System.out.println("Zero");
            return;
        }
        else if(num>0)
        {
            if(num%2==0)
            {
                System.out.println("Positive Even Number");
            }
            else {
                System.out.println("Positive Odd Number");
            }
        }else {
            if(num%2==0)
            {
                System.out.println("Negative Even Number");
            }else{
                System.out.println("Negative Odd Number");
            }
        }
    }

}
