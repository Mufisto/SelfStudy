// Write a method named printFactors with one parameter of type int named number. 

// If number is < 1, the method should print "Invalid Value".

// The method should print all factors of the number.
// A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

// For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

public class PrintFactorsQuestion {

    private static int TEST_INPUT1 = 100;

    private static void printFactors(int input) {
        if (input < 1) {
            System.out.println("Invalid Value.");
        } else {
            int counter = 1;
            boolean isDivisor;

            while (counter <= input) {
                isDivisor = input % counter == 0;
                if (isDivisor) {
                    System.out.println((counter + " is a divisor of " + input));
                }

                counter++;
            }
        }
    }

    public static void main(String[] args) {

        printFactors(TEST_INPUT1);

    }

}
