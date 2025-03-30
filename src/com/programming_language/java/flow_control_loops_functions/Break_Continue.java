package com.programming_language.java.flow_control_loops_functions;

import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for x : ");
        int x = input.nextInt();

        System.out.print("Enter the value for y : ");
        int y = input.nextInt();

        for(int i=0;i<5;i++)
        {
            if(y==0)
            {
                continue;
            }else{
                float ans =  x/y;
                System.out.println(ans);
            }
        }
    }
}
