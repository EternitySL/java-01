package com.HomeWork;

public class ForExercise {
    public static void main(String[] args){
        int sum = 10;
        for(int i = 0;i <= sum;i++){
             for(int j = 0;j <= sum;j++){
                if(i + j == sum){
                    System.out.println(i+"+"+j+"="+sum);
                }
            }
        }
    }
}
