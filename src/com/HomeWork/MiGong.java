package com.HomeWork;

public class MiGong{
    public static void main (String[] args){
        int[][] map = new int[8][7];
        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
//4.将最右面的一列和最左面的一列，全部设置为 1
        for(int i = 0; i < 8; i++) {

            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //map[1][1] = 1; //测试回溯
// map[2][1] = 1;
// map[2][2] = 1;
// map[1][2] = 1;
//输出当前的地图
        T a = new T();
        a.findWay(map,1,1);
        System.out.println("=====当前地图情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }


    }
}
class T {
 public boolean findWay(int[][] map , int i, int j) {
        if(map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if(map[i][j] == 0) {//当前这个位置 0,说明表示可以走
//我们假定可以走通
                map[i][j] = 2;
//使用找路策略，来确定该位置是否真的可以走通
//下->右->上->左
                if(findWay(map, i + 1, j)) {//先走下
                    return true;
                } else if(findWay(map, i, j + 1)){//右
                    return true;
                } else if(findWay(map, i-1, j)) {//上
                    return true;
                } else if(findWay(map, i, j-1)){//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else { //map[i][j] = 1 , 2, 3
                return false;
            }
        }
    }
}