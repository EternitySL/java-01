package com.zpdu.test05;

import org.junit.jupiter.api.Test;

/**
 * kmp算法
 */
public class test053 {

        public static void main(String[] args) {
            String str1 = "aabbcc";
            String str2 = "bc";
            int index = strStr(str1, str2);
            System.out.println("index=" + index);
        }
    public static int strStr(String haystack, String needle) {
        int[] next = kmpNext(needle);
        for (int i = 0,j = 0; i < haystack.length(); i++) {
            while (j > 0&& haystack.charAt(i) != needle.charAt(j)){
                j = next[j - 1];
            }if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if (j == needle.length()) {
                return i - j +1;
            }
        }return -1;
    }
    public static int[] kmpNext(String dest) {
        int[] nest = new int[dest.length()];
        nest[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = nest[j - 1];
            }
         if(dest.charAt(i) == dest.charAt(j)){
           j++;
        }
        nest[i]=j;
        }
        return nest;
    }


}

