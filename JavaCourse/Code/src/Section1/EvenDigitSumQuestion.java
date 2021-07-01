package Section1;

// Write a method named getEvenDigitSum with one parameter of type int called number.

// The method should return the sum of the even digits within the number.

// If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSumQuestion {

    private static final int TEST_INPUT = 12345678; // 2 + 4 + 6 + 8 = 20

    private static int getEvenDigitSum(int input) {

        if (input < 0) {
            return -1;
        } else {

            int tempInput = input;
            int lastDigit = 0;
            int total = 0;

            boolean isEven;

            while (tempInput > 10) {
                lastDigit = tempInput % 10;
                isEven = (lastDigit % 2) == 0;

                if (isEven) {
                    total = total + lastDigit;
                }

                tempInput = tempInput / 10;
            }

            isEven = (tempInput % 2) == 0;
            if (isEven) {
                total = total + tempInput;
            }

            return total;
        }

    }

    public static void main(String[] args) {
        System.out.println("The answer is: " + getEvenDigitSum(TEST_INPUT));
    }

}
