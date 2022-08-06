package com.company;

import java.util.Scanner;

public class checkPrime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int n = sc.nextInt();

            boolean check=true;
            if(n<2){
               check= false;
            }

            for (int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    check=false;
                }
            }
            if (check){
                System.out.println("is prime number");
            }else {
                System.out.println("not prime number");
            }

        }
    }



