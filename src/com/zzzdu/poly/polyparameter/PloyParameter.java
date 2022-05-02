package com.zzzdu.poly.polyparameter;

public class PloyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker(100,"张三");
        Meneger meneger = new Meneger(1000,"李四",100000);



        String a = "111";
        Object o = new Object();
        System.out.println(worker.toString());  //toString 输出类型加属性
        System.out.println(worker);   //直接输出对象等价与worker.toString




    }
    public void showEmpAnnal(Employee e){
        System.out.println();
    }


}
