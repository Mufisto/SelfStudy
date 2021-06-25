// Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 

// If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

// The method should return the greatest common divisor of the two numbers (int).

// The greatest common divisor is the largest positive
// integer that can fully divide each of the integers (i.e. without leaving a remainder).

// For example 12 and 30:
// 12 can be divided by 1, 2, 3, 4, 6, 12
// 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

// The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

public class GreatestCommonDivisorQuestion {

    private static int TEST_INPUT1 = 114;
    private static int TEST_INPUT2 = 12;

    private static int getGreatestCommonDivisor(int input1, int input2) {
        int smallerValue;
        int biggerValue;

        int greatestDivisor = 1;
        int counter = 0;

        if ((input1 < 10) || (input2 < 10)) {
            return -1;
        } else {
            if (input1 < input2) {
                smallerValue = input1;
                biggerValue = input2;
            } else {
                smallerValue = input2;
                biggerValue = input1;
            }

            counter = 1;
            while (counter <= smallerValue) {
                if ((smallerValue % counter == 0) && (biggerValue % counter == 0)) {
                    greatestDivisor = counter;
                }
                counter++;
            }

            return greatestDivisor;
        }
    }

    public static void main(String[] args) {
        System.out.println("The answer is: " + getGreatestCommonDivisor(TEST_INPUT1, TEST_INPUT2));

    }

}
