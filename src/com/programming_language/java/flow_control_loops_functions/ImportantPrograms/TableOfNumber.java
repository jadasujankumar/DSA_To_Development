package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;

import java.util.Scanner;

public class TableOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.format("%d * %d = %d\n",num,i,num*i);
        }
    }
}
