package com.company;

public class whileClass {
    public static void main(String[] args) {
//        int n = 0;
//        int sum = 0;
//        do {
//            sum+=n;
//             n++;
//        }while(n< 10);
//
//
//        System.out.println(sum);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; i < 5; j++) {
                if (i == j) {
                    break;

                }
                System.out.println(i+" "+ j);
            }
        }
    }
}