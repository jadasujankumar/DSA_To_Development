package com.programming_language.java.introduction_variable_operators;

public class JavaOutputTypes {

    public static void main(String[] args) {

        float pi = (float) Math.PI;
        int age = 25;
        String name = "Sujan";
        char grade ='A';

        System.out.format("%f\n",pi);
        System.out.format("%.2f\n",pi);
        System.out.format("%5.2f\n",pi);
        System.out.format("%07.2f\n",pi);

        System.out.printf("%s\n",name);
        System.out.printf("%d\n",age);
        System.out.printf("%c\n",grade);

        System.out.println(name);
        System.out.print(name);
        System.out.print(age);
    }
}
