package com.company;

import java.util.Scanner;

public class CalculateRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amout money:");
        double money =sc.nextDouble();
        System.out.println("Enter the Month");
        int month  = sc.nextInt();
        System.out.println("Enter the interestrate:");
        double interestRate=sc.nextDouble();
        double totalInterest =0;
        for (int i=0 ; i<month;i++){
            totalInterest+= money*(interestRate/100)/12*month;
        }
        System.out.println(totalInterest);
    }

}
