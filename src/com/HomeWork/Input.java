package com.HomeWork;

import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请分别输入姓名，年龄，薪水");
        while(myScanner.hasNext()){
            System.out.println(myScanner.nextLine());
        }

    }
}
