package com.company;

public class Main {

    public static void main(String[] args) {

        //TASK 1
        java.util.Scanner  in = new  java.util.Scanner(System.in);
        int x = in.nextInt ();
        if (x < 10){
            System.out.println("Number is lower than 10");
        }if (x < 100){
            System.out.println("Number is lower than 100");
        }if (x < 1000){
            System.out.println("Number is lower than 1000");
        }

        //TASK 2
        if (x >= 0){
            System.out.println("Number is in A Range");
        }if (x <=1 ){
            System.out.println("Number is in B Range");
        }if (x == 1 || x == 0){
            System.out.println("Number is in C Range");
        }

        //TASK 3
        System.out.println("How many number are you gonna add: ");
        int n = in.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.printf("Enter %d number: ",n);
        for (int i = 0; i < n; i++){
            int current = in.nextInt();
            if (current > largest){
                largest = current;
            }if (current < smallest){
                smallest = current;
            }
        }
        System.out.println("Largest number is: "+largest);
        System.out.println("Smallest number is: "+smallest);

        //TASK 4
        int num = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num > num2 && num > num3) {
            if (num2 > num3) {
                System.out.printf("%d, %d, %d\n", num3, num2, num);
            } else {
                System.out.printf("%d, %d, %d\n", num2, num3, num);
            }
        } else if (num2 > num3) {
            if (num > num3) {
                System.out.printf("%d, %d, %d\n", num3, num, num2);
            } else {
                System.out.printf("%d, %d, %d\n", num, num3, num2);
            }
        } else {
            if (num > num2) {
                System.out.printf("%d, %d, %d\n", num2, num, num3);
            } else {
                System.out.printf("%d, %d, %d\n", num, num2, num3);
            }
        }


        //TASK 5
        System.out.println("Please enter your height: ");
        double height = in.nextInt();
        System.out.println("Please enter your weight: ");
        double weight = in.nextInt();
        double bmi = (100*100*weight)/(height*height);
        System.out.println("Your bmi is: "+bmi);

        //TASK 6
        int a = 2 * ((5 + 3) * 4 - 8);
        System.out.println(a);


        //TASK 7
        System.out.println("Enter celsius: ");
        double cel = in.nextDouble();
        double fah = (9.0/5.0)*cel+32;
        System.out.println("Temperature in Fahrenheit is: "+fah);


    }
}
