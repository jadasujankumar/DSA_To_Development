package com.programming_language.java.introduction_variable_operators;

import java.util.Scanner;

public class LogicalOperator {
   // &&, ||, !
   public static void main(String[] args) {
       String userName = "geek";
       String passWord = "GeekUser@123";

       boolean x =true, y=false;

       Scanner input = new Scanner(System.in);

       System.out.print("Enter the userName : ");
       String name = input.nextLine();

       System.out.print("Enter the password:");
       String pass = input.nextLine();

       if(userName.equals(name) && passWord.equals(pass))
       {
           System.out.println("Welcome geek!");
       }
       else{
           System.out.println("Invalid Credentials");
       }

       System.out.println(x && y);
       System.out.println(x || y);
       System.out.println(!x);
   }

}
