package com.zzzdu.test;

public class Factory  {
    public static Horse useHorse(){
        return  new Horse();
    }
    public static Boat useBoat(){
        return  new Boat();
    }
}
