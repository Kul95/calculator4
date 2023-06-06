package com.bridglabz.Practice20;

import java.util.Scanner;

public class GCD {
    public static void gcd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number.:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number.");
        int num2=sc.nextInt();
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
        }
        System.out.println("Gcd of two numbers are : "+num1);
    }
    public static void main(String[] args) {
     gcd();
    }
}
