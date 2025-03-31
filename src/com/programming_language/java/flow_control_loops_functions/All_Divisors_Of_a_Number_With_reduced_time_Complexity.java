package com.programming_language.java.flow_control_loops_functions;
import java.util.*;

public class All_Divisors_Of_a_Number_With_reduced_time_Complexity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                System.out.print(i+" ");
                if(i!=num/i)
                {
                    System.out.print(num/i+" ");
                }
            }
        }
    }
}
