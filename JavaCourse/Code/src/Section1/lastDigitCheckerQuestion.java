package Section1;
// Write a method named hasSameLastDigit with three parameters of type int. 

// Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
// If one of the numbers is not within the range, the method should return false.

// The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

public class lastDigitCheckerQuestion {

    private static int TEST_INPUT1 = 124;
    private static int TEST_INPUT2 = 453;
    private static int TEST_INPUT3 = 653;

    private static boolean hasSameLastDigit(int input1, int input2, int input3) {

        if (input1 < 10 || input1 > 1000) {
            return false;
        }
        if (input2 < 10 || input2 > 1000) {
            return false;
        }
        if (input3 < 10 || input3 > 1000) {
            return false;
        }

        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        int lastDigit3 = input3 % 10;

        if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3)) {
            System.out.println("FIRST ONE");
            return true;
        }

        if (lastDigit2 == lastDigit3) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("The answer is: " + hasSameLastDigit(TEST_INPUT1, TEST_INPUT2, TEST_INPUT3));

    }

}
