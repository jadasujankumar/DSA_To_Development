package com.programming_language.java.introduction_variable_operators;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp1;

        System.out.println("The Values of A and B before swapping are : a : "+a+" b : "+b);

        temp1 = a;

        a=b;
        b=temp1;

        System.out.println("The Values of A and B after swapping are : a : "+a+" b : "+b);

    }
}
