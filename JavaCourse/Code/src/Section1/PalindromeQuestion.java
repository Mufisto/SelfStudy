package Section1;
//Write a method called isPalindrome with one int parameter called number.

// The method needs to return a boolean.

// It should return true if the number is a palindrome number otherwise it should return false.

class PalindromeQuestion {

    private static final int TEST_INPUT = 1221;

    private static boolean isPalindrome(int num) {
        if (num == 0) {
            return true;
        }
        if (num < 0) {
            num = num * -1;
        }

        int tmpNum = num;
        int reverse = 0;

        while (tmpNum >= 10) {
            int lastDigit = tmpNum % 10;
            reverse = reverse + lastDigit;
            tmpNum = tmpNum / 10;
            reverse = reverse * 10;
        }

        reverse = reverse + tmpNum;

        if ((reverse - num) == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        System.out.println("The answer is: " + isPalindrome(TEST_INPUT));
    }
}