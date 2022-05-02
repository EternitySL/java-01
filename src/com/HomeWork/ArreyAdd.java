package com.HomeWork;

import java.util.Scanner;

public class ArreyAdd {
    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int array1[] = new int[array.length + 1];     //这里4就是数值里面具有4个元素!!!
        for (int i = 0; i <= 2; i++) {     //遍历拷贝
            array1[i] = array[i];
        }
        Scanner scanner = new Scanner(System.in);

        array1[array.length] = 4;
        array = array1;                         //让arr指向array1，ar的原来数组销毁
        for (int y = 0; y <= array.length - 1; y++) {   //遍历求出
            System.out.println(array[y]);
        }


    }

}

class cat {
    String name;
    int age;

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}