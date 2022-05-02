package com.HomeWork;

public class Homework03 {
    public static void main(String[] args){
        book p = new book("火影忍者",120);
        p.info();
        p.updatePrice();
        System.out.println("书名\t"+p.name+"\n价格\t"+p.price);

    }
}
class book{
    String name;
    double price;
    public book(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void info(){
        System.out.println("书名\t"+name+"\n价格\t"+price);
    }
    public void updatePrice(){
        if(price >= 150){
            price = 150;
        }else if(price >100 && price <= 150 ) {
            price = 100;
        }


    }
}
