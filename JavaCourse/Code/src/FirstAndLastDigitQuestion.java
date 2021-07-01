// Write a method named sumFirstAndLastDigit with one parameter of type int called number.

// The method needs to find the first and the last digit of the parameter number passed to the method,
// using a loop and return the sum of the first and the last digit of that number.

// If the number is negative then the method needs to return -1 to indicate an invalid value.

public class FirstAndLastDigitQuestion {

    private static final int TEST_NUMBER = 123;

    private static int sumFirstAndLastDigit(int input) {
        if (input <= 0) {
            return -1;
        }

        int lastDigit = input % 10;

        while (input >= 10) {
            input = input / 10;
        }

        return input + lastDigit;

    }

    public static void main(String[] args) {

        System.out.println("The answer is: " + sumFirstAndLastDigit(TEST_NUMBER));

    }

}
