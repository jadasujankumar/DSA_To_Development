package com.dsa_to_development.introduction_variable_operators;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp;

        System.out.println("The Values of A and B before swapping are : a : "+a+" b : "+b);

        temp = a;

        a=b;
        b=temp;

        System.out.println("The Values of A and B after swapping are : a : "+a+" b : "+b);

    }
}
