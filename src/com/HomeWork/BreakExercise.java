package com.HomeWork;

import java.util.Scanner;
public class BreakExercise {
    public static void main(String[] args){
        //创建string
       String name = "";
       String passwd = "";
        Scanner myScanner = new Scanner(System.in);
      for(int i = 1;i <= 3;i++){
          System.out.println("n");
          name = myScanner.next();
          System.out.println("m");
          passwd = myScanner.next();
          //用equals判断是否为相等返回boolean值
          if(name.equals("丁真") && passwd.equals("666") ){
              //跳出循环
              break;  //可以通过label1:进行跳转:跳转到break label1
          }
          int chance = 3 - i;
          System.out.println("你还有"+chance+"机会");


      }
      System.out.println("输入正确");
    }
}
