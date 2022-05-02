package com.HomeWork;

public class MemTool{
    public static void main(String[] args) {
        int arr[][] = {{1 , 23 , 24},{13,41}};
        Tools tools  = new Tools();         //tools为引用对象实际对象是new Tools,在栈中分配的地址指向堆中new出内存空间；也说new个对象
        // tools与下文的p都是相当于名字指向对象的
        tools.age = 1;
        tools.name = " wdwdwd";
        Tools p = tools;
        System.out.println(tools.name);
        p.name = "66";
        System.out.println(tools.name);
        p = null;
        System.out.println(tools.name);
        tools.Printarr(arr);
        System.out.println(p.name);  //p地址被销毁

    }
}
class Tools {               //Tools相当与类，方法例如是人类
    String name;
    int age ;                  //在栈中以引用变量进行修改，为人的各种 ；属性（成员变量）
    public void Printarr (int arr[][]){  //在栈中创建空间，进行类似人的行为；成员方法
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}