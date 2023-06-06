package com.bridglabz.Practice20;

import java.util.Scanner;

public class SwapTwoNum {
    public static void swap(){
        System.out.println("Enter the first number: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Before swapping : "+num1+ " and "+ num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping :"+num1+ " and "+num2);
    }
    public static void main(String[] args) {
        swap();
    }
}
