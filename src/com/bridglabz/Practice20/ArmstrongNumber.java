package com.bridglabz.Practice20;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void armstrongNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        int result=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            result=result+(rem*rem*rem);
            num=num/10;
        }
        if(result==temp){
            System.out.println("Armstrong number...");
        }else{
            System.out.println("Not a Armstrong number..");
        }
    }
    public static void main(String[] args) {
        armstrongNum();
    }
}
