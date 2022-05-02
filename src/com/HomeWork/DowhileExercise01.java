package com.HomeWork;

import java.util.Scanner;
public class DowhileExercise01 {
    public static void main(String[] args) {
        char isMoney;
        do {
            //判断是否还钱
            System.out.println("还钱吗？y/n");
            Scanner myScanner = new Scanner(System.in);
            isMoney = myScanner.next().charAt(0);
            System.out.println("使用5连鞭");
        } while (isMoney != 'y');
    }
}
