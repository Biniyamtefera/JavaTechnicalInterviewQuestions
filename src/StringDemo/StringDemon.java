package StringDemo;

public class StringDemon {

    public static void main(String[] args) {
        /**
         * reverse a palindrome.
         */
        
        String palindrome = "Don't say I am Biniyam";
        reversePalindrome(palindrome);
        reversePalindrome2(palindrome);
        
    }
    
    public static void reversePalindrome(String  str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reversePalindrome2(String str) {

    String newStr ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            newStr +=str.charAt(i);
        }

        System.out.println(newStr);
    }
}
