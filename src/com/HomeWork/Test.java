package com.HomeWork;

import java.util.Scanner;       //调取类
public class Test {              //public class 就是类，后面跟的是类名，方法在类里面，一个类可以有很多的方法 规范：类名首字母得大写[大驼峰]！
    public static void main(String[] args){          //String stuName aaaBbb小驼峰(驼峰法)变量，常量规范AAA_BBB
        Scanner input = new Scanner(System.in);   //输入
        //String str=input.nextLine();        //nextLine输入的全部，使用next()方法时，将空格看作是两个字符串的间隔：使用nextInt()方法时，
        // 与next()方法类似，只是它的返回值是int类型的，依旧将空格看作是两个输入的数据的
        while (input.hasNext()){  //has.Next返回的boolean类型
            System.out.println("请输入你的名字");
            System.out.println(input.nextLine());


        }





    }
}