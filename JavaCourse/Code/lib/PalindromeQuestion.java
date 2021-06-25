class PalindromeQuestion {
    private static boolean isPalindrome(int num) {
        if(num==0) {
            return true;
        }
        if(num<0){
            num=  num * -1;
        }

        int tmpNum = num;
        int reverse = 0;

        while(tmpNum >= 10) {
            int lastDigit=tmpNum % 10;
            reverse = reverse + lastDigit;
            tmpNum = tmpNum / 10;
            reverse = reverse * 10;
        }
        
        reverse = reverse + tmpNum;

        if((reverse - num) == 0)
        return true;
        else return false;
        // Working with 1221
        


    }

    public static void main(String[] args){
        System.out.println("The answer is: " + isPalindrome(0));
    }
}