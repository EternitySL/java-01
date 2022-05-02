package com.HomeWork;

import java.util.Scanner;
public class If01 {
    public static void main(String[] args){
        System.out.println("请输入当前月份");
        Scanner myScanner = new Scanner(System.in);
        if(myScanner.hasNext()) {                 //用if判断后接着
            System.out.println("请输入你的年龄");
            Scanner myAge = new Scanner(System.in);
            int age = myAge.nextInt();
            int month = myScanner.nextInt();
            if(month <= 6&&month >= 4){
                if(age >=18&&age<=60){
                    System.out.println("票价60");
                }
                else if(age < 18){
                    System.out.println("半价");
                }
                else if(age > 60){
                    System.out.println("票价1/3");
                }

            }
            else{
                if(age >=18){
                    System.out.println("40");
                }
                else{
                    System.out.println("20");
                }

            }
        }


    }

}
