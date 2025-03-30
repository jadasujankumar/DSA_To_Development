package com.programming_language.java.flow_control_loops_functions.ImportantPrograms;
import java.util.*;

public class PrintSumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int sum =0;

        System.out.print("Enter the number : ");
        int n = input.nextInt();

        if(n<0)
        {
            System.out.println("Invalid Number Entered, Please try again!");
        }
        else{
            sum = n*(n+1)/2;
            System.out.println("Sum = "+sum);
        }
    }
}
