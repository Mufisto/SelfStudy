package Section1;
// What is the perfect number?
// A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
// Proper positive divisors are positive integers that fully divide the perfect number without leaving 
// a remainder and exclude the perfect number itself.
// For example, take the number 6:
// Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), 
// and the sum of its proper divisors is 1 + 2 + 3 = 6. 

// Therefore, 6 is a perfect number (as well as the first perfect number).

// Write a method named isPerfectNumber with one parameter of type int named number. 

// If number is < 1, the method should return false.

// The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise,
//  it should return false.

public class PerfectNumberQuestion {

    private static int TEST_INPUT1 = 6;

    private static boolean isPerfectNumber(int input) {
        if (input < 1) {
            return false;
        } else {
            int counter = 1;
            int total = 0;

            int upperLimit = (input / 2) + 1;
            while (counter < upperLimit) {
                if (input % counter == 0) {

                    total = total + counter;
                }

                counter++;
            }

            if (total == input) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        if ((isPerfectNumber(TEST_INPUT1))) {
            System.out.println(TEST_INPUT1 + " is a perfect number!");
        } else {
            System.out.println(TEST_INPUT1 + " is NOT a perfect number!");
        }
    }

}
