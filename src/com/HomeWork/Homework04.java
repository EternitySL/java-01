package com.HomeWork;
import java.util.Scanner;

public class Homework04 {
    public  static void main(String[] args){
        Rot rot = new Rot();
        while (true){
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            rot.guess(a);
        }
    }
}
class Rot{
    public void guess(int n) {
        int random01 = (int) (Math.random() * 3);
        System.out.println("电脑出的是" + random01);
        if (random01 == n) {
            System.out.println("平局");
        } else if (random01 == 0 && n == 1) {
            System.out.println("电脑win");
        } else if (random01 == 1 && n == 2) {
            System.out.println("电脑win");
        } else if (random01 == 2 && n == 0) {
            System.out.println("电脑win");
        }else {
            System.out.println("人win");

        }
    }
}