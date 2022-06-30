package com.zpdu.test05;

import javax.swing.text.StyleContext;
import java.math.BigInteger;
import java.util.*;

/**
 * @author ：shuangleng
 * @date ：Created in 2022/6/21 20:22
 * @description：
 */
public class test056 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int begin = 0;
        int end = size - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (nums[middle] > target) {
                end = middle - 1;
            }
            if (nums[middle] < target) {
                begin = middle + 1;
            } else {
                return middle;
            }
        }return -1;

    }
}