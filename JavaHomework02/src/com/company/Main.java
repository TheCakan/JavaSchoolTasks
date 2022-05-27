package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //===TASK 1===
        Scanner src = new Scanner(System.in);
        double a,b,c;
        double root1,root2;
        System.out.println("Enter 3 number: ");
        a = src.nextDouble();
        b = src.nextDouble();
        c = src.nextDouble();

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        }

        else if (determinant == 0) {
            root1 = -b / (2.0 * a);
            System.out.println("The root is "+root1);
        }else {
            System.out.println("Roots are not real");
        }

        //===TASK 2===
        System.out.println("Please enter wrt");
        float wrt = src.nextFloat();
        int value = 0;
        String answer=null;
        if(wrt <= 0 || wrt >= 5){
            value = 0;
        }
        if(wrt >= -1 && wrt <= 6){
            value =1;
        }
        if(wrt >= 5 && wrt <= 6){
            value = 2;
        }
        if(wrt >= 2 && wrt <= 3){
            value = 3;
        }
        switch (value){
            case 0 -> answer = "A";
            case 1 -> answer = "B";
            case 2 -> answer = "A&B";
            case 3 -> answer = "B&C";
        }
        System.out.println(answer);

        //===TASK 3===
        if(wrt <= -5 || wrt >= 5 || wrt >= 10){
            value = 4;
        }
        if(wrt >= 1 && wrt <= 15){
            value =5;
        }
        if(wrt >= 10 && wrt <= 15){
            value = 6;
        }
        if(wrt >= -2 && wrt <= 5){
            value = 7;
        }
        switch (value){
            case 4 -> answer = "A";
            case 5 -> answer = "B";
            case 6 -> answer = "A&B";
            case 7 -> answer = "B&C";
        }
        System.out.println(answer);

        //===TASK 4===
        int n = 4;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int result;

        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 0; i < n;i++){
            int current = src.nextInt();
            if (current > largest) {
                largest = current;
            } if (current < smallest){
                smallest = current;
            }
        }
        System.out.println("Largest number is : " +largest);
        System.out.println("Smallest number is: " +smallest);
        result = largest-smallest;
        System.out.println("Difference is "+result);

        //===TASK 5===
        System.out.println("Please enter two number: ");
        int r1 = src.nextInt();
        int r2 = src.nextInt();
        boolean var;
        if (r1%2==0 && r2%2==0){
            var = true;
            System.out.println("Your numbers are divisible by 2");
        }else System.out.println("Your numbers are not divisible by 2");
        if (r1%3==0 && r2%3==0){
            var = true;
            System.out.println("Your numbers are divisible by 3");
        }else System.out.println("Your numbers are not divisible by 3");
        if (r1%5==0 && r2%5==0){
            var = true;
            System.out.println("Your numbers are divisible by 5");
        }else System.out.println("Your numbers are not divisible by 5");

        //===TASK6===
        System.out.println("Please select the region Europe = e / America = u : ");
        String reg = src.next();
        switch (reg){
            case "e": //I don't understand why my program always skip this section I tried everything
            // It doesn't even ask user.Please let me know, I want to know what's the problem
            // I solved the problem 16 min before deadline I was using .nextLine() instead of .next()
            // I didn't do the calculation part because of this problem
            // :( I'm sorry I couldn't do it on time but ı will solve this task.
                System.out.println("Enter miles travelled : ");
                double miles = src.nextDouble();
                System.out.println("Enter gallons : ");
                double gallons= src.nextDouble();
                double mpg=miles/gallons;
                System.out.println("miles per gallons = "+mpg);
                break;
            case "u":
                System.out.println("Enter km travelled : ");
                miles = src.nextDouble();
                System.out.println("Enter litres : ");
                gallons= src.nextDouble();
                double litres = gallons *3.7854;

            default:
                System.out.println("Invalid choice");
                break;
        }



    }
}
