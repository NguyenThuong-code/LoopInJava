package com.company;

public class primeLessThanNumber {
    public static void main(String[] args) {
       int n=0;
            while (n<100){
                boolean check=true;
                if(n<2){
                    check= false;
                }
                for (int j=2; j<=Math.sqrt(n); j++){
                    if(n%j==0){
                        check=false;
                    }
                }
                if(check){
                    System.out.println(n);
                    n++;
                }else {
                    n++;
                }
            }
    }
}
