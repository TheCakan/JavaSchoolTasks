package com.company;

import java.util.Scanner;

public class task2{

    public static void main (String[] args){

        java.util.Scanner in = new java.util.Scanner (System.in);

        System.out.println("Input number");

        int x = in.nextInt();

        for(int i= 0;i<=5;i++){

            System.out.println(Math.pow(x,i));
        }
    }
}
