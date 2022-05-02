package com.HomeWork;

import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args){
        for(int j = 1;j <=3; j++) {                                    //有3个班级
        double sum = 0.0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("第"+j+"班级"+i+"名成绩");           //班级学生与名次
                Scanner myScanner = new Scanner(System.in);
                double sum1 = myScanner.nextDouble();
                sum += sum1;

            }
        System.out.println(sum);
        }
    }
}
