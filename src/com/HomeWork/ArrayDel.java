package com.HomeWork;

public class ArrayDel {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5};
        int[] arr01 = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 2) {
                arr01[j] = arr[i];
                j++;

            }
        }
        arr = arr01;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
