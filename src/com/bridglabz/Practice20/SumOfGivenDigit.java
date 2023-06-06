package com.bridglabz.Practice20;

import java.util.Scanner;

public class SumOfGivenDigit {
    public static void sumOfDigits(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of given digits:"+sum);
    }
    public static void main(String[] args) {
        sumOfDigits();
    }
}
