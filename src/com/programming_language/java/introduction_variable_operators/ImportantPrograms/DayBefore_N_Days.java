package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

import java.util.Scanner;

public class DayBefore_N_Days {

    public static void main(String[] args) {

        // 0 - sunday
        // 1 - monday
        // 2 - Tuesday
        // 3 - Wednesday
        // 4 - Thursday
        // 5 - Friday
        // 6 - Saturday

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current day:");
        int d = input.nextInt();

        System.out.print("Enter the number of days before the current day : ");
        int n = input.nextInt();

        int x = n%7;

        int ans = d-x;

        if(ans>=0)
        {
            System.out.println("The day before n "+n+" days from the current day is : "+ans);
        }
        else{
            System.out.println("The day before "+n+" days from the current day is : "+(ans+7));
        }
    }
}
