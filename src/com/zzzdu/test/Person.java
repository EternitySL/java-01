package com.zzzdu.test;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }


    public void passRive(){
        Factory.useBoat().work();
    }
    public void walk(){
        Factory.useHorse().work();
    }
}
