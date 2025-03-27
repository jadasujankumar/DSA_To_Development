package com.programming_language.java.introduction_variable_operators.ImportantPrograms;

public class SwapTheNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println("Values before Swapping num1 : "+num1+" num2 : "+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Values after Swapping num1 : "+num1+" and num2 : "+num2);
    }
}
