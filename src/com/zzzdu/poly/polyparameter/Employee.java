package com.zzzdu.poly.polyparameter;

public class Employee {
    double pvivate;
    String name;

    public Employee(double pvivate, String name) {
        this.pvivate = pvivate;
        this.name = name;
    }


    public double getAnnual() {
        return pvivate * 12;
    }

    public void setPvivate(double pvivate) {
        this.pvivate = pvivate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
