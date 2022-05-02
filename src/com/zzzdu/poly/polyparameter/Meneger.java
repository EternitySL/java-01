package com.zzzdu.poly.polyparameter;

public class Meneger extends Employee{
    double bonus;

    public Meneger(double pvivate, String name, double bonus) {
        super(pvivate, name);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(name +"经理让\t");

    }



    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

}
