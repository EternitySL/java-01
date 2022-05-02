package com.HomeWork;

public class Test011 {
    public static void main(String[] args) {
         int a[] = {1,2};
        changeStr(a);
        //System.out.println(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }

    public static void changeStr(int[] arr) {
        arr[0] = 33;
    }
}
