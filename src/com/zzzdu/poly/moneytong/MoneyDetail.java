package com.zzzdu.poly.moneytong;

import java.util.Date;

public class MoneyDetail {
    String[] arr = new String[0];
    String expense;
    String income;
    int i = 0;
    double sum = 0;

    public String[] getArr() {
        return arr;
    }

    public void setArr() {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public String getExpense() {
        return expense;


    }

    public void setExpense(String expense) {
        this.expense = expense;
        String array1[] = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            array1[i] = arr[i];
        }
        Date date = new Date();
        arr = array1;
        sum -= Double.parseDouble(expense);
        arr[i] = "花费\t" + expense + "\t" + date + "\t" + sum;
        i = +1;

    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
        String array1[] = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            array1[i] = arr[i];
        }
        Date date = new Date();
        arr = array1;
        sum += Double.parseDouble(income);
        arr[i] = "收益入账\t" + income + "\t" + date + "\t" + sum;
        i = +1;

    }
}
