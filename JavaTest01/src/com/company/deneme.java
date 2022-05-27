package com.company;

public class deneme {
    public static void main(String[] args){
        int[] t1 = {1, 2, 3, 4};
        int[][] t2D = { {1, 2}, {t1.length}, t1 };
        for(int i = 0; i < t2D.length; i++){
            for(int j = 0; j < t2D[i].length; j++)
                System.out.print(t2D[i][j]);
            System.out.println();
        }

    }
}
