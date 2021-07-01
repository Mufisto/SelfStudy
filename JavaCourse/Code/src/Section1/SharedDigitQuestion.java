package Section1;
// Write a method named hasSharedDigit with two parameters of type int. 

// Each number should be within the range of 10 (inclusive) - 99 (inclusive).
// If one of the numbers is not within the range, the method should return false.

// The method should return true if there is a digit that appears in both numbers,
// such as 2 in 12 and 23; otherwise, the method should return false.

public class SharedDigitQuestion {

    private static int TEST_INPUT1 = 23;
    private static int TEST_INPUT2 = 35;

    private static boolean hasSharedDigit(int input1, int input2) {

        if (((input1 < 10) || (input1 > 99)) || ((input2 < 10) || (input2 > 99))) {
            return false;
        } else {

            int lastDigit1 = input1 % 10;
            int firstDigit1 = input1 / 10;

            int lastDigit2 = input2 % 10;
            int firstDigit2 = input2 / 10;

            if ((lastDigit1 == firstDigit2) || (lastDigit1 == lastDigit2)) {
                return true;
            }

            if ((firstDigit1 == firstDigit2) || (firstDigit1 == lastDigit2)) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("The answer is: " + hasSharedDigit(TEST_INPUT1, TEST_INPUT2));

    }

}
