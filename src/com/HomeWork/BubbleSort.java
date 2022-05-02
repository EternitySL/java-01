package com.HomeWork;

public class BubbleSort {
    public static void main(String[] args){
        int a[] = {1,222,31,124,122};
        for(int j = 0 ;j < a.length-1;j++){
            for(int i = 0 ;i < a.length-1-j;i++) {   //冒泡排序
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] =temp;

                }
            }
        }
        for(int q = 0;q < a.length;q++){
            System.out.println(a[q]);
        }
    }
}
