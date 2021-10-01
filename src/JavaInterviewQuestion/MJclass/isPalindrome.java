package JavaInterviewQuestion.MJclass;

public class isPalindrome {
    public static void main(String[] args) {
       int num = 2332;
        System.out.println("isPalindrome(num) = " + isPalindrome(num));
        System.out.println("isPalindrome2(num) = " + isPalindrome2(num));
        System.out.println("isPalindrome3(num) = " + isPalindrome3(num));
    }
    public static boolean isPalindrome(int number) {
        //first way: ()cheap way ==> cast into to string
        String numString = String.valueOf(number);
        for(int i= 0; i < numString.length()/2; i++) {
            if(numString.charAt(i)!=numString.charAt(numString.length()-1-i)) {
                return false;
            }
        }


        return true;
    }

    public static boolean isPalindrome2(int number) {
        //12321==> palindrome
        //I need to reverse the number ==> then check the reverse with origninal one
        // if they are equal ==> number is palindrome
        //how I can reverse the number?
        //how I can print the last digit of number?
        //

        int lastDigit = 0;

        // how I can decrease mu digit ==> number/10==> 1221/0=>122
        //1/10=0
        int copyNum = number;
        int reverse = 0;
        while (copyNum > 0) {
            lastDigit = number%10;
            reverse =(reverse*10) + lastDigit;
            copyNum/=10;
        }

        if(reverse==number) {
            return true;
        }else {
            return false;
        }

    }

    public   static boolean isPalindrome3(int num) {
        // Assume the number is 2332

        int rem  =0;
        int newNum = num; //2332
        int reverse =0;

        while(newNum > 0) { //t
            rem = newNum%10;//2 3
            reverse = 10*reverse + rem;  //2  30+ 2 =32
            newNum= newNum/10; //233

        }
        if(reverse==num) {
            return true;
        }
        return false;
    }

}
