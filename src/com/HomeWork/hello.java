package com.HomeWork;

public class hello {
    public static void main(String[] args){
       for(int i = 1;i <= 4; i++){
           for(int b = 1;b <=4 - i; b++){
               System.out.print(" ");
           }
           for(int a = 1;a <= 2 * i - 1; a++){
               //判断*的位置在哪里进行输出，最初与最末端时候输出*，其他输出 ，最后一行全输出*
               if(a == 1 || a == 2 * i -1 || i ==4 ) {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }

       System.out.println("");
       }
    }

}