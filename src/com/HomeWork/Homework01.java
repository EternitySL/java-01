package com.HomeWork;

public class Homework01 {
    public static void main(String[] args){
        double[] arr = null;
        A01 p = new A01();
        System.out.println(p.Max(arr));
       // for(int i = 0; i < arr.length - 1; i++){
       //     System.out.println(arr[i]);
      //  }
        }
}
class A01{
    public String Max(double a[]){

        double max = 0;
        if(a != null && a.length > 0){
            for(int i = 0; i < a.length - 1; i++){
                max= a[i] > a[i + 1] ? a[i] : a[i + 1];
                a[i + 1] = max;

            }
            return max + "";}else{return "错误";

        }

    }
}
