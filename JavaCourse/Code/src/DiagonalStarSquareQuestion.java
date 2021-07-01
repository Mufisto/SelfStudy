// Write a method named printSquareStar with one parameter of type int named number. 

// If number is < 5, the method should print "Invalid Value".

// The method should print diagonals to generate a rectangular pattern composed of stars (*). 
// This should be accomplished by using loops (see examples below).

// EXAMPLE INPUT/OUTPUT:

// EXAMPLE 1

// printSquareStar(5); should print the following:

// → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

// *****
// ** **
// * * *
// ** **
// *****

// Explanation:

// *****   5 stars
// ** **   2 stars space 2 stars
// * * *   1 star space 1 star space 1 star
// ** **   2 stars space 2 stars
// *****   5 stars

public class DiagonalStarSquareQuestion {

    private static int TEST_INPUT = 20;

    private static void printSquareStar(int input) {

        if (input < 5) {
            System.out.println("Invalid Value");
        }

        else {
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input; j++) {

                    if (i == 0 || j == 0 || i == (input - 1) || j == (input - 1) || i == j) {
                        System.out.print("*");
                    } else if (j == (input - i) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println();

            }

        }

    }

    public static void main(String[] args) {

        printSquareStar(TEST_INPUT);

    }

}
