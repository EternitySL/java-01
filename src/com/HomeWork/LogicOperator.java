package com.HomeWork;

public class LogicOperator {
    public static void main(String[] args){
        int a = 1;
        int b = 45;
        int c = 4;
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 : c;
        System.out.println("最大数="+max2);
        /*if(a > 0 && ++b < 2){  //&&是和||是或者， & |逻辑 &&||短路 后面不执行 ^异或 异true同false
            System.out.println("hhh");
        }
        System.out.println(b);
         */
        //三元运算符转换
       // int result = a > b ? ++b :--a;   //ture前false后
       // System.out.println(a+"+"+b);



    }
}
