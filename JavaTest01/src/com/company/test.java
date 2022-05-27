package com.company;

// Java program to print square inside
// a square pattern
import java.lang.*;

        class GFG {

            // Function to print the pattern square
// inside a square
            static void printPattern(int n) {

                // To access rows of the square
                for (int i = 1; i <= n; i++) {

                    // To access columns of the square
                    for (int j = 1; j <= n; j++) {

                        /*** For printing the required square pattern ***/
                        if ((i == 1 || i == n || j == 1 || j == n) ||
                                (i >= 3 && i <= n - 2 && j >= 3 && j <= n - 2) &&
                                        (i == 3 || i == n - 2 || j == 3 || j == n - 2))
                        {
                            // Prints star(*)
                            System.out.print("X");
                        }
                        else
                        {
                            // Prints space(" ")
                            System.out.print("O");
                        }
                    }

                    System.out.print("\n");
                }
            }

            // Driver code
            public static void main(String[] args) {
                int n = 7;
                printPattern(n);
            }
        }

// This code is contributed by Anant Agarwal.


