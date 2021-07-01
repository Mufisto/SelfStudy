package Section1;
import java.util.Scanner;

// -Read 10 numbers from the console entered by the user and print the sum of those numbers.
// -Create a Scanner like we did in the previous video.
// -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
// -If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
// -Use the nextInt() method to get the number and add it to the sum.
// -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
// -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.

public class ReadingUserInputQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter #" + i);

            if (scanner.hasNextInt()) {
                total += scanner.nextInt();
            } else {
                System.out.println("Invalid Number, try again");
                i--;
            }
            scanner.nextLine();
        }

        System.out.println("The total was: " + total);
        scanner.close();

    }

}
