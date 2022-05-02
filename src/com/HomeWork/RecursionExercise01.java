package com.HomeWork;

public class RecursionExercise01 {
    public static void main(String[] args){
        TT a = new TT();
        System.out.println(a.meth(4));

    }
}
class TT{
    public int meth(int n){
        if( n == 1 || n == 2){
            return 1;
        }else{
            return meth(n-1) + meth(n - 2);
        }

    }
}
