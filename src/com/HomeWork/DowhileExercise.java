package com.HomeWork;

public class DowhileExercise {
    public static void main(String[] args){
        int i = 1;
        int count = 0;
        do{
            if(i % 5 == 0 && i % 3 != 0 ){   //避免多程嵌套用&&与
                System.out.println(i);
                count++;
            }
            i++;

        }while(i <= 100);
        System.out.println("一共="+count);
    }
}
