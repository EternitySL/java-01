package com.zzzdu.poly.polyparameter;

public class Worker extends Employee{
    public Worker(double pvivate, String name) {
        super(pvivate, name);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "pvivate=" + pvivate +
                ", name='" + name + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name+"员工"+getName());
    }


}
