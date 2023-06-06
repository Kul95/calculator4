package com.bridglabz.Practice20;

import java.util.Scanner;

public class VowelOrConsonent1 {
    public static void alphabateOrNot(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if((ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u')||(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')){
            System.out.println(ch+" is a Vowel...");
        }else{
            System.out.println("It is a Consonent ...");
        }
    }
    public static void main(String[] args) {
        alphabateOrNot();
    }
}
