package com.programming_language.java.introduction_variable_operators;

import java.util.ArrayList;
import java.util.Scanner;

public class PreciseFormatJava {

    static ArrayList<Float> divisionWithPrecision(float a, float b)
    {
        ArrayList<Float> resultList = new ArrayList<>();

        float result = a/b;
        resultList.add(result);

        resultList.add(Float.parseFloat(String.format("%.3f",result)));

        return resultList;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the a : ");
        float a = input.nextFloat();

        System.out.print("Enter the b : ");
        float b = input.nextFloat();

        System.out.println(divisionWithPrecision(a,b));

    }
}
