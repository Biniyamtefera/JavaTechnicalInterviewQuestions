package Book;

import JavaInterviewQuestion.MJclass.isPalindrome;

import java.util.stream.IntStream;

public class Q11CheckingPalindrome {
    public static void main(String[] args) {

       String word = "wodgdowk";
        System.out.println("isPalindrome(word) = " + isPalindrome(word));
        System.out.println("isPalindrome2(word) = " + isPalindrome2(word));
        System.out.println("isPalindrome3(word) = " + isPalindrome3(word));


    }

    //What is palindrome => whether a string or a number looks unchanged when it's reversed
    //example madam=> reading this word from both direction and the same result will obtained

    public static boolean isPalindrome(String word) {

        boolean isPalindrome = true;
        for (int i = 0,k = word.length()-1; i < word.length(); i++,k--) {
               if(word.charAt(i) != word.charAt(k)) {
                   return false;
               }
            }
        return true;
    }

    public static boolean isPalindrome2(String word) {

        boolean isPalindrome = true;
        int k = word.length();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(k-i-1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * The Java API provides the StringBuilder class, which uses the reverse() method.
     * As its name suggests, the reverse() method returns the reverse given string.
     * In the case of a palindrome, the given string should be equal to the reverse version of it:
     */

    public static boolean isPalindrome3(String word){
       return word.equals(new StringBuilder(word).reverse().toString());
    }

    /**
     * In Java 8 functional style, there is a single line of code for this as well.
     * Simply define IntStream ranging from 0 to half of the given string and use the
     * noneMatch() short-circuiting terminal operation with a predicate that compares
     * the letters by following the meet-in-the-middle approach:
     */

    public static boolean isPalindrome4(String str) {

        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) !=
                        str.charAt(str.length() - p - 1));
    }


}
