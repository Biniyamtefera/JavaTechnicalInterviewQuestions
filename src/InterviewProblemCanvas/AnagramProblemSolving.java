package InterviewProblemCanvas;

import java.util.Arrays;
import java.util.List;

public class AnagramProblemSolving {


    public static void main(String[] args) {
        System.out.println("isAnagram1(\"abba\", \"abba\") = " + isAnagram1("abbc", "abba"));
        isAnagram("abba", "abbc");
    }

    public static void isAnagram(String input1, String input2) {
        //Remove all whitespace first
        String s1 = input1.replaceAll(" ", "");
        String s2 = input1.replaceAll(" ", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //convert into character array
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();

            //sorting both character array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            //check if both arrays are equal
            status = Arrays.equals(s1Array, s2Array);
        }

        if (status) {
            System.out.println(s1 + " and " + s2 + " are Anagram");
        } else {
            System.out.println(s1 + " and " + s2 + " are not Anagram");
        }


    }

    public static boolean isAnagram1(String str1, String str2) {
        //Check if space is available or not
        str1.replaceAll(" ", "");
        str2.replaceAll(" ", "");
        // Check the             size is the same or not
        boolean isAnagram = true;
        if(str1.length()!=str2.length()) {
            return isAnagram = false;
        }
        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

       return isAnagram = Arrays.equals(char1, char2);

    }

}
