package com.bridglabz.Practice20;

import java.util.Scanner;

public class TableProgram {
    public static void table(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
        System.out.println(num+"*"+i+" = "+(num*i));
        }
    }
    public static void main(String[] args) {
        table();
    }
}
