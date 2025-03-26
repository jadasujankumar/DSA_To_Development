package com.programming_language.java.introduction_variable_operators;

public class AssignementOperator {

    public static void main(String[] args) {
        int x = 10, y = 5,z;
        x+=y;   //15
        System.out.println(x);
        x%=y;  //0
        System.out.println(x);
        z=x=y;   //5
        System.out.println(z);    //Assignment operators has precedence or associtvity from right to left for Arthimetic operators it is from left to right
    }
}
