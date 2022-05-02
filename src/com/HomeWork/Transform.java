package com.HomeWork;

import java.util.Scanner;
public class Transform {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //不对，以后进行修改
        int Input = myScanner.nextInt();
        int Index = 0;
        char[] s = {1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'};
        do {
            Index = Input % 16;
            System.out.print(s[Index - 1]);
        }while(Index == 0);
        }
    }


