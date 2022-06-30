package com.zpdu.test05;

import java.util.Arrays;

public class test054 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3};
        int i1 = searchInsert(i, 4);
        System.out.println(i1);


    }

    public static int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i < 0) {
            return (-i - 1);
        }
        return i;

    }
}
