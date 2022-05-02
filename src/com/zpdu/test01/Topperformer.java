package com.zpdu.test01;

public class Topperformer {
    String name;
    double wages;

    public Topperformer(String name, double wages) {
        this.name = name;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Topperformer{" +
                "name='" + name + '\'' +
                ", wages=" + wages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
}
