package com.ccc.homework;

public class Test {
    public static void main(String[] args) {
        System.out.println(Son.a);
    }
}
class Father{

    static {
        System.out.println("我是父类静态");
    }

}
class Son extends Father{
    static int a = 1;


}
