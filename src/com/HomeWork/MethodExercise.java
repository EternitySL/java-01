package com.HomeWork;

public class MethodExercise {
    public static void main(String[] args){
      /*  Judge myJudge =new Judge();
        System.out.println(myJudge.IsPrime(2));

    }
}
class Judge{
    public boolean IsPrime(int n){
        return n % 2 == 0;*/
        Input01 myInput01 = new Input01();
        myInput01.print01(2,2,'*');

    }
}

class Input01{
    public void print01(int row,int col,char c){
        for(int i = 0; i < col ; i++){
            for(int j = 0; j < row ; j++){
                System.out.print(c);
            }
            System.out.println();
        }




    }
}