package com.zpdu.test05;

import java.util.Arrays;

public class test05 {
    public String longestCommonPrefix(String[] strs) {
        String str1 = strs[0];
        for (String str : strs) {
            while (!str.startsWith(str1)){
                str1.substring(0,str1.length()-1);
            }
        }  if(str1.length() == 0)return"";
        return str1;
    }

    public static void main(String[] args) {
        test05 test05 = new test05();

    }


}
