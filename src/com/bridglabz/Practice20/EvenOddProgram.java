package com.bridglabz.Practice20;

import java.util.Scanner;

public class EvenOddProgram {

    public static void evenOdd( ){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println(num+ ": is Odd Number");
        }
    }
    public static void main(String[] args) {

        evenOdd();
    }
}
