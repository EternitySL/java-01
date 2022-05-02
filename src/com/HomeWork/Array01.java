package com.HomeWork;

public class Array01 {
    public static void main(String[] args){
        int reverse = 0;
        int array[] = {1 ,42 ,23 ,45 ,-11,11};
        //将数组一共进行3次转换
        for(int i = 0;i < array.length/2;i++){
            //将数组的值分别对应相等
            reverse = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = reverse;

        }
        //输出数组
        for(int j = 0 ; j < array.length; j++){
            System.out.print(array[j]+"\t");
        }

    }
}
