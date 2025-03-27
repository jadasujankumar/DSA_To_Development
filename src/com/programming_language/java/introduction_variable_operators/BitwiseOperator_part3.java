package com.programming_language.java.introduction_variable_operators;

public class BitwiseOperator_part3 {
    public static void main(String[] args) {
        int x = -3;
        int y = 10;
        System.out.println(x>>10);
        System.out.println(x>>2);

        System.out.println(y>>2);  // Signed Right shift operator
        System.out.println(x>>>1);  //unsigned Right shift Operator
    }
}
