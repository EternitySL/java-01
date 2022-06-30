package com.zpdu.test05;

import java.util.ArrayList;
import java.util.Arrays;

public class test051 {
    public static void main(String[] args) {
        String s = "abccc222";
        System.out.println(s.charAt(1));
        ArrayList<Object> objects = new ArrayList<>();
        int index = 0;
        int[] ints = new int[10];
        for (int i = 0; i < s.length()-1; i++) {
            objects.add(s.charAt(i));
            if (objects.contains(s.charAt(i + 1 ))) {
                ints[index] = i+1;
                index++;
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}
