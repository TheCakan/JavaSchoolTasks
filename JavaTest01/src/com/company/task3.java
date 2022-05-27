package com.company;

public class task3 {

    public static void main(String[] args){
        int[] arr = new int[20];
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
            System.out.print(arr[i] + "  ");
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==1)
                counter++;;
        }
        System.out.println("It has 1 in total "+counter);

    }
}
