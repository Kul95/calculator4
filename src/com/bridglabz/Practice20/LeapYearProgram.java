package com.bridglabz.Practice20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LeapYearProgram {
    public static void leapYear(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.println("Leap year program");
        }else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String[] args) {
        leapYear();
    }
}
