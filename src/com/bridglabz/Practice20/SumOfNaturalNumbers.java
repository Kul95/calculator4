package com.bridglabz.Practice20;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void sumOfNaturalNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of natural numbers:"+sum);
    }
    public static void main(String[] args) {
        sumOfNaturalNum();
    }
}
