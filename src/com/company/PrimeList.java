package com.company;

public class PrimeList {
    public static void main(String[] args) {

      int i = 0;
        int n=0;
      while (i <20){
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
           i++;
           n++;

       }else {
           n++;
       }
      }
    }
}
