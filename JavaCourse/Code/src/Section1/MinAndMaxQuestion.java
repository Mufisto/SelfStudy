package Section1;
import java.util.Scanner;

// -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
// -Before the user enters the number, print the message gEnter number:h
// -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

public class MinAndMaxQuestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int inputNum = 0;

        while (true) {

            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                inputNum = scanner.nextInt();

                if (min == 0 && max == 0) {
                    min = inputNum;
                    max = inputNum;
                }
                if (inputNum < min) {
                    min = inputNum;
                }

                if (inputNum > max) {
                    max = inputNum;
                }

                scanner.nextLine();
            } else {
                System.out.println("Input Invalid");
                break;
            }

        }

        System.out.println("The min was: " + min + " and the max was: " + max);
        scanner.close();
    }

}
