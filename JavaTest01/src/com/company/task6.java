package com.company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int side = 5;
        for (int i=0; i < side;i++){
            for (int j=0; j <side; j++){
                if (i == 0 || i == side - 1 || j == 0 || j== side - 1){
                    System.out.print("x");
                }else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }
}
