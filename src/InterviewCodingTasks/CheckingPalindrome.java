package InterviewCodingTasks;

import java.util.stream.IntStream;

public class CheckingPalindrome {
    public static void main(String[] args) {
        isPalindrome("java");
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length();

        while (right > left) {
            if (str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }

    public static boolean isPalindrome2(String str2) {

        int n = str2.length();
        for (int i=0; i < n/2; n++) {
            if(str2.charAt(i) !=str2.charAt(n-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String str3) {
        return IntStream.range(0,str3.length()/2).noneMatch(p -> str3.charAt(p) !=
                str3.charAt(str3.length()-p-1));

    }


}
