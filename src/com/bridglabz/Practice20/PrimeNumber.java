package com.bridglabz.Practice20;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                temp=temp+1;
                break;
            }
        }
        if(temp==0){
            System.out.println(" prime number...");
        }else{
            System.out.println(" Not aPrime number...");
        }
    }
    public static void main(String[] args) {
        primeNumber();
    }
}
