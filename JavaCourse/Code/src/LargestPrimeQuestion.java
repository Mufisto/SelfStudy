// Write a method named getLargestPrime with one parameter of type int named number. 

// If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

// The method should calculate the largest prime factor of a given number and return it.

public class LargestPrimeQuestion {

    private static int getLargestPrime(int input) {

        if (input <= 1) {
            return -1;
        } else {
            boolean inputIsPrime = false;
            boolean totalIsPrime = true;

            int pointer = (input / 2) + 1;

            while (pointer >= 2) {
                if (input % pointer == 0) { // If the pointer can divide into the main number

                    totalIsPrime = false;
                    inputIsPrime = true;
                    for (int pointer2 = 2; pointer2 < pointer; pointer2++) {
                        if (pointer % pointer2 == 0) {
                            inputIsPrime = false;
                        }

                    }

                    if (inputIsPrime) {
                        return pointer;
                    }

                }
                pointer--;
            }

            if (totalIsPrime) {
                return input;
            } else {
                return -1;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Largest Prime is: " + getLargestPrime(16));

    }

}
