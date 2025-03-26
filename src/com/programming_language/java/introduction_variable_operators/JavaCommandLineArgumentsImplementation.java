package com.programming_language.java.introduction_variable_operators;

public class JavaCommandLineArgumentsImplementation {

    public static void main(String[] args) {
        if(args.length > 0)
        {
            System.out.print("The command Line Arguments are : ");
            for(String x : args)
            {
                System.out.print(x+" ");
            }
        }
        else{
            System.out.print("No Arguments");
        }
    }
}
