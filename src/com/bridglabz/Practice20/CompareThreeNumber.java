package com.bridglabz.Practice20;

import java.util.Scanner;

public class CompareThreeNumber {
    public static void compare(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the third number:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" :First number is grater number:");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" :Second number is grater number.");
        }else{
            System.out.println(num3+ " :Third number is grater number ");
        }
    }
    public static void main(String[] args) {
        compare();
    }
}
