package com.bridglabz.Practice20;

import java.util.Scanner;

public class CheckNumPositiveOrNegative {
    public static void PosOrNegative(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        String num1=(num>0)?"Positive":"Negative";
        System.out.println(num1);
    }
    public static void main(String[] args) {
        PosOrNegative();
    }
}
