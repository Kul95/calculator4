package com.bridglabz.Practice20;

import java.util.Scanner;

public class PalindromNumber {
    public static void palindrom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        int temp;
        temp=num;
        int rev=0;
        while(num>0){
           rev=rev*10+num%10;
           num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrom number...");
        }else{
            System.out.println("Not a Palindrom number.");
        }
    }
    public static void main(String[] args) {
        palindrom();

    }
}
