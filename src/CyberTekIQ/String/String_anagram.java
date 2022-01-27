package CyberTekIQ.String;

import java.util.Arrays;
import java.util.TreeSet;

public class String_anagram {
    public static void main(String[] args) {
        /**
         * Write a function that heck id a string is built of the same letter as another string.
         * Ex same("abc","abc"); ->true , solution 1:
         *   ("abc", "abb")
         */

        String str = "abba";
        String str2 = "bbaa";
        System.out.println("isAnagram(str) = " + IsAnagram(str, str2));
    }

    public static boolean  IsAnagram(String str1, String str2) {


        boolean isAnagram = false;

        if(str1.length()!=str2.length()) {
             return  isAnagram;


        }
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i) +"")) {
                 return isAnagram ;

            }

            }
        return true;

    }

    public static boolean IsAnagram2(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return (a.equals(b));
    }
}
