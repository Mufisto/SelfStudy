
class ConditionalsCode {

    // ----------------------------------------------

    public static void main(String[] args) {
        PrimeNumberQuestion a = new PrimeNumberQuestion();
        PrimeNumbersRangeQuestion b = new PrimeNumbersRangeQuestion();
        Sum3Question c = new Sum3Question();
        SumOddQuestion d = new SumOddQuestion();
        DoWhileQuestion e = new DoWhileQuestion();

        a.run();
        b.run();
        c.run();
        d.run(1, 11);
        e.run();

    }
}

class PrimeNumberQuestion {

        public PrimeNumberQuestion(){

        }

        public void run() {

            int rangeUpper = 1000;
            int rangeLower = 42;

            int primeNumbers = 0;

            for (int i = rangeLower; i <= rangeUpper; i++) {
                if (isPrime(i)) {
                    primeNumbers++;
                    System.out.println(i + " is a Prime Number, of " + primeNumbers);
                    if (primeNumbers >= 3)
                        break;
                }

            }

        }

        private boolean isPrime(int n) {
            if (n == 1) {
                return false;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

// GET THE FIRST 3 PRIME NUMBERS IN A RANGE
class PrimeNumbersRangeQuestion {
    public void run() {

        int rangeUpper = 1000;
        int rangeLower = 42;

        int primeNumbers = 0;

        for (int i = rangeLower; i <= rangeUpper; i++) {
            if (isPrime(i)) {
                primeNumbers++;
                System.out.println(i + " is a Prime Number, of " + primeNumbers);
                if (primeNumbers >= 3)
                    break;
            }

        }

    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// ----------------------------------------------
// GET THE SUM OF THE FIRST 5 NUMBERs DIVISIBLE BY 3 OR 5 IN A SET RANGE, THEN
// BREAK (ALL CODE IN MAIN METHOD)
class Sum3Question {
    public void run() {
        int rangeUpper = 1000;
        int rangeLower = 1;

        int totalSum = 0;
        int count = 0;

        for (int i = rangeLower; i <= rangeUpper; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i + "is divisible");
                totalSum = totalSum + i;
            }

            if (count >= 5) {
                System.out.println("The sum of all these numbers is: " + totalSum);
                count = 0;
                totalSum = 0;
                break;
            }

        }

    }

}

// -------------------------------------------------
// GET THE SUM OF ALL THE ODD NUMBERS WITHING A RANGE
class SumOddQuestion {
        private boolean isOdd(int number) {
            if (number == 0) {
                return false;
            } else
                return number % 2 == 1;
        }

        private int sumOdd(int start, int end) {
            if (start > 0 && end > 0 && end >= start) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum = sum + i;
                    }
                }
                return sum;
            } else
                return -1;
        }

        public void run(int start, int end) {
            System.out.println("The sum of the odd numbers is: " + sumOdd(start, end));
        }

    }

// ------------------------------------
// DO/WHILE PRACTICE:
// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

class DoWhileQuestion {

    private boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public void run() {

        // Modify the while code below
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 5;
        int finishNumber = 6;
        int evenNumbersFound = 0;
        do {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
            evenNumbersFound++;
        } while (number <= finishNumber && evenNumbersFound < 5);
        System.out.println("The total was: " + evenNumbersFound);
    }
}
