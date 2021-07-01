package Section1;
// Write a method called numberToWords with one int parameter named number.

// The method should print out the passed number using words for the digits.

// If the number is negative, print "Invalid Value".

// To print the number as words, follow these steps:

// 1. Extract the last digit of the given number using the remainder operator. 
// 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
// 3. Remove the last digit from the number.
// 4. Repeat Steps 2 through 4 until the number is 0.

// The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.

// The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.

// Use the method reverse within the method numberToWords in order to print the words in the correct order.

// Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.

// The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
// For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

public class NumberToWordsQuestion {

    private static int TEST_INPUT1 = 1234;
    private static int TEST_INPUT2 = 123;
    private static int TEST_INPUT3 = 214748364;

    private static void numberToWords(int input) {
        if (input < 0) {
            System.out.println("Invalid Value");
        } else {
            int readNumber = reverse(input);
            int counter = getDigitCount(input) - 1;

            while (counter > 0) {
                System.out.print(convertToString(readNumber % 10) + " ");
                readNumber = readNumber / 10;
                counter--;
            }

            System.out.print(convertToString(readNumber % 10));

        }

    }

    private static String convertToString(int input) {
        switch (input) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid Value";
        }
    }

    // print input: 123 as output: 321
    private static int reverse(int input) {
        if (input < 0) {
            return -1;
        }

        int tempInput = input;
        int answer = 0;

        while (tempInput >= 10) {
            answer = (answer * 10) + (tempInput % 10);
            tempInput = tempInput / 10;
        }

        answer = (answer * 10) + tempInput;

        return answer;

    }

    private static int getDigitCount(int input) {
        if (input < 0) {
            return -1;
        }

        int total = 1;
        int tempInput = input;

        while (tempInput >= 10) {
            total++;
            tempInput = tempInput / 10;
        }

        return total;

    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(TEST_INPUT1));
        System.out.println("The reverse of: " + TEST_INPUT2 + " is: " + reverse(TEST_INPUT2));
        numberToWords(TEST_INPUT3);
    }

}
