package com.bridglabz.Practice20;

import java.util.Scanner;

public class AsciiChar {
    public static void ascii(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        int ascii=ch;
//        int typecast=(int)ch;
        System.out.println(ascii);
//        System.out.println(typecast);
    }
    public static void main(String[] args) {
        ascii();
    }
}
