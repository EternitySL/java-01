package com.ccc.homework;

public class PC extends Computer {
    String color;


    public PC() {
        System.out.println("wszc");

    }
//    方法重写，类型相同
//    public void AA(){
//        System.out.println("我来也");
//    }
    public int get(){
        return 1;
    }

    public PC(String cup, String memory, String disk, String color) {
//        super(cup, memory, disk);     同包可调用private.
        //super,代表父类，this代表子类。
        this.color = color;
    }

    public void in() {
        super.info();
    }
}
