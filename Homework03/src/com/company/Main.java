package com.company;

public class Main {
    static void checkISBN ( char [] isbn ) {
        int lastDigit = isbn[isbn.length-1];
        int dashes = 0;
        int sum = 0;
        char isInvalid = '0';
        for (int i = 0,j = 10; i < isbn.length; i++,j--){

            if (isbn[i] != 'X' && isbn[i] != '-' && isbn[i] != '0' && isbn[i] != '1' && isbn[i] != '2' && isbn[i] != '3' && isbn[i] != '4' && isbn[i] != '5' && isbn[i] != '6' && isbn[i] != '7' && isbn[i] != '8' && isbn[i] != '9'){
                isInvalid = isbn[i];
                break;
            }else if (isbn[i] == '-'){
                j++;
                dashes++;
                continue;
            }else if(isbn[i] == 'X'){
                sum += 10;
            }else if(dashes > 3) {
                break;
            }else
                sum += j * Character.getNumericValue(isbn[i]);
        }
        if (sum%11 == 0) {
            for (int i = 0; i < isbn.length; i++) {
                System.out.print(isbn[i]);
            }
            System.out.print(": OK");
        }

    }
    public static void main ( String [] args ) {
        char [][] isbns = {
                {'9', '6', '0', '-', '4', '2', '5', '-', '0', '5', '9', '-', '0'} ,
                {'8', '0', '-', '9', '0', '2', '7', '4', '4', '-', '1', '-', '6'} ,
                {'0', '-', '8', '0', '4', '4', '-', '2', '9', '5', '8', '-', 'X'} ,
                {'0', '-', '9', '4', '3', '3', '9', '6', '-', '0', '4', '-', '2'} ,
                {'0', '-', '9', '7', '5', '2', '2', '9', '8', '-', '0', '-', '5'} ,
                {'9', '9', '7', '1', '-', '5', '-', '0', '2', 'l', '0', '-', '0'} ,
                {'9', '3', '-', '8', '6', '5', '4', '-', '-', '2', '1', '-', '4'} ,
                {'9', '9', '9', '2', '1', '-', '5', '8', '8', '-', '1', '0', '7'}};
        for ( int i = 0; i < isbns . length ; ++ i )
            checkISBN ( isbns [ i ]) ;
    }

}
