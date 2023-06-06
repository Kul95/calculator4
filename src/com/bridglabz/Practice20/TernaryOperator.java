package com.bridglabz.Practice20;

import java.util.Scanner;

public class TernaryOperator {
    public static void ternary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        String num=(num1>num2)?"First grater ":"Second grater";
        System.out.println(num);
    }
    public static void main(String[] args) {
        ternary();
    }
}
