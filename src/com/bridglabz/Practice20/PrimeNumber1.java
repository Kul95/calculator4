package com.bridglabz.Practice20;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number...");
        }else{
            System.out.println("Not a prime number..");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
