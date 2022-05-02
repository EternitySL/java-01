package com.zzzdu.poly.moneytong;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoneyDetail moneyDetail = new MoneyDetail();
        //判断是否退出
        boolean loop = true;
        do {
            menu01 menu01 = new menu01();
            menu01.info();
            String key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println("1.零钱通明细 ");
                    moneyDetail.setArr();
                    break;
                case "2":
                    System.out.println("2.收益入账 ");
                    Scanner scanner1 = new Scanner(System.in);
                    moneyDetail.setIncome(scanner.next());
                    break;
                case "3":
                    System.out.println("3.消费");
                    Scanner scanner2 = new Scanner(System.in);
                    moneyDetail.setExpense(scanner2.next());
                    break;
                case "4":
                    while (true) {
                        System.out.println("你真的要退出吗y/n?");
                        Scanner scanner3 = new Scanner(System.in);
                        char key1 = scanner3.next().charAt(0);
                        if (key1 == 'y') {
                            loop = false;
                            break;
                        } else if (key1 == 'n') {
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("输出有误");
                    break;
            }
        } while (loop);
        System.out.println("退出零钱通系统");


    }
}
