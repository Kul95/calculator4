package com.bridglabz.Practice20;

import java.util.Scanner;

public class QuarditicRoots {
    public static void quarditicRoots(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a=sc.nextInt();
        System.out.println("Enter the second integer:");
        int b=sc.nextInt();
        System.out.println("Enter the third integer :");
        int c=sc.nextInt();
        int determinant=b*b-4*a*c;
        if(determinant>0){
            double root1=-b+Math.sqrt(determinant)/(2*a);
            double root2=-b-Math.sqrt(determinant)/(2*a);
            System.out.println(root1+" and "+root2);
        }else if(determinant==0){
            int root1=-b/(2*a);
        }else{
            System.out.println("Roots are complex.");
        }
    }
    public static void main(String[] args) {
        quarditicRoots();
    }
}
