package com.bridglabz.Practice20;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void numberOfDigits(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        int digit=0;
        int count=0;
        while(num>0){
             digit=digit*10+num%10;
             num=num/10;
             count++;

        }
        System.out.println("Number of digits are:"+count);
    }
    public static void main(String[] args) {
        numberOfDigits();
    }
}
