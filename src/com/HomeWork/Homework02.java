package com.HomeWork;

public class Homework02 {
    public static void main(String[] args) {
        A20 p = new A20();
        String arr[] = {"www", "123"};
        System.out.println(p.find(arr, "1234"));

    }
}

class A20 {
    public int find(String arr[], String Str) {
        int Index = 0;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(Str)) {
                    Index = i + 1;
                    break;
                } else {
                    Index = -1;
                }
            }
        } else {
            return -1;
        }
        return Index;
    }
}
