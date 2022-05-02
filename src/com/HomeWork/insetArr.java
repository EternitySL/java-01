package com.HomeWork;

public class insetArr {
    public static void main(String[] args){
        int[] arr = {1, 3, 6, 7};
        int inset = 5;         //插入的数字母
        int index = -1;     //默认下标位置
        int arr01[] = new int[arr.length+1];
        for(int i = 0; i < arr.length;i++) {
            if (arr[i] > inset) {
                index = i;    //求出下标的数值
                break;
            }

        }
        System.out.println(index);
        for(int i = 0,j = 0; i < arr01.length;i++){
            if(i != index){
                arr01[i] = arr[j];
                j++;                       //当下标相等时候，i增加j不变（灵魂所在）！！
            }else{
                arr01[index] = inset ;
            }
        }
        arr = arr01;
        for (int i : arr) {   //遍历求出
            System.out.print(i + "\t");
        }
    }
}
