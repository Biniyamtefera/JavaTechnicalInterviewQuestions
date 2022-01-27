package InterviewCodingTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    // solution 1:
    public boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }


    // solution 2
    public boolean Same(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
    //mysolution1
    public static boolean isSame1(String str1, String str2) {
        boolean isSame = true;

        if(str1.length()!=str2.length()) {
            return false;
        }

        for (int i=0; i < str2.length(); i++) {
            if(!str1.contains(str2.charAt(i) +"")) {
                return false;
            }
        }
     return true;
    }




}
