package com.programming_language.java.introduction_variable_operators;

public class BitwiseOperator_Part1 {

    public static void main(String[] args) {
        int x = 3; // 011
        int y = 6; // 110

        System.out.println(x & y); //Bitwise AND operator output : 2
        System.out.println(x | y); //Bitwise OR operator output : 7
        System.out.println(x ^ y); //Bitwise XOR operator output : 5

    }
}
