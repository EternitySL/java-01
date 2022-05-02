package com.HomeWork;

public class YangHui {  //杨辉三角
    public  static void main(String[] args){
        int[][] arr = new int [10][];
        for(int i = 0; i < arr.length;i++){
            arr[i]= new int[i+1];
            for(int j = 0;j < arr[i].length;j++){
                if(j == 0 || j == arr[i].length-1){         //每行与最后一行都是1
                    arr[i][j] = 1;

                }else{
                     arr[i][j] = arr[i-1][j] + arr[i-1][j-1];            //规律
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){              //进行输出
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


