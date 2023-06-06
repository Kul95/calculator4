package com.bridglabz.Practice20;

import java.util.Scanner;

public class FactorialNumber {
    public static void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial number is: "+fact);
    }
    public static void main(String[] args) {
        fact();

    }
}
