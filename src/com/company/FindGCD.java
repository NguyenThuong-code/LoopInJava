package com.company;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number a");
        int a= sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        int temp=0;
        for(int i=1;i<=a;i++){
            if(a%i ==0&&b%i==0){
                temp= i;
            }
        }
        System.out.println("GCD of two number is"+ temp);
    }
}
