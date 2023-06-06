package com.bridglabz.Practice20;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
           rev=rev*10+num%10;
           num/=10;
        }
        System.out.println("Reverse number is: "+rev);
    }
    public static void main(String[] args) {
        reverseNum();
    }
}
