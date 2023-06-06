package com.bridglabz.Practice20;

import java.util.Scanner;

public class AlphabateOrNot {
    public static void alphabateOrNot(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if((ch>'a' && ch<'z')||(ch>'A'&& ch<'Z')){
            System.out.println("Given character is alphabate");
        }else{
            System.out.println("Given character is not a alphabater");
        }
    }
    public static void main(String[] args) {
        alphabateOrNot();
    }
}
