package com.ccc.homework;

public class Computer {
    private String cup;
    private String memory;
    private String disk;


    public Computer() {
        System.out.println("我是父无参默认构造器");
    }

    public Computer(String cup, String memory, String disk) {
        this.cup = cup;
        this.memory = memory;
        this.disk = disk;
    }

    public void AA() {
        System.out.println(get()+1); //调用get()方法动态绑定机制绑定运行类型的get方法
    }                                //属性没有动态绑定机制
    public int get(){
        return 11;
    }

    public void info() {
        System.out.println("cup=\t" + cup + "\tmemory=\t" + memory + "\tdist=\t" + disk);
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
