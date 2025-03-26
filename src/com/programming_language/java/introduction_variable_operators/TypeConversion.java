package com.programming_language.java.introduction_variable_operators;

public class TypeConversion {

    public static void main(String[] args) {
        int a = 10;
        float f = a; //Widening byte -> short -> int -> float -> double

        System.out.println(a);
        System.out.println(f);

        double d = 65.4;
        int i = (int)d;
        char c = (char)i;

        System.out.println(d);
        System.out.println(i);
        System.out.println(c);
    }
}
