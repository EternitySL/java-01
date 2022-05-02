package com.ccc.homework;

public class ExtendsExercise {
    public static void main(String[] args) {
        //代码块规则
//        AA aa = new AA();
//        System.out.println("===========");
//        AA bb = new AA();
      //  System.out.println("===========");
      //  int j = AA.i;  //静态方法只调用一次
        CC cc = new CC(); //静态代码的初始化与代码块执行按前后顺序排列，普通代码块同理

    }
}
class CC{
    private static int n = getn1();
    static {
        System.out.println("CC的静态代码块被调用");
    }
    public  CC() {
        System.out.println("俺是CC的构造器");
    }
     public static int getn1(){
        System.out.println("getn1被调用");
        return 100;
    }
}
class BB{
    {
        System.out.println("我是父类代码块");
    }
    static {
        System.out.println("我是父静态代码快");
    }

    public  BB() {
        System.out.println("我是父类构造器");
    }
}
class AA extends BB{
    static int i = 1;
    static{
        System.out.println("我是子静态代码块");
    }
    {
        System.out.println("我是子类代码块");
    }

    public AA() {
        System.out.println("我是子类构造器");
    }
}
