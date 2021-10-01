package JavaInterviewQuestion.TechnicalQuestion1;

import java.util.*;

public class TechnicalPractice {
    public static void main(String[] args) {
        countChar("abbc");
        System.out.println();
        System.out.println(isbuiltSame("abc", "cabv"));
        removeDuplicate("abccdfgab");
        uniqueLetters("aabbc");
        printUnique("aabbc");
        fibonacci(13);
        identify(0);
        System.out.println(removeDuplicateChars("ABCACBDD"));
        System.out.println("checkAnagram(\"food\", \"dofo\") = " + checkAnagram("food", "dofo"));


    }
    /**
     * Write a method that will count number of each char in a String
     * countChar("abbc"); -> {a=1, b=2, c=1}
     */
    public static void countChar(String string) {
        int count=0;
        for (int i=0 ; i < string.length(); i++) {
            for(int j=0; j< string.length();j++) {
                if(string.charAt(i)==string.charAt(j)) {
                    count++;
                }
            }
            System.out.print(string.charAt(i) + "=" + count + " ");
            count=0;
        }

    }
    /**
     * Write a method that check if a string is build out of the same letters as
     * another string same("abc","cab"); -> true same("abc","abb"); -> false
     */
    public static boolean isbuiltSame(String word1, String word2) {
        boolean isSameLetter = false;
        if (word1.length() != word2.length() || word1.length() == 0 || word2.length() == 0) {
            return isSameLetter;
        }
        for (int i = 0; i < word1.length(); i++) {
            if (!word2.contains(word1.charAt(i) + "")) {
                return isSameLetter;
            }
        }
        return true;
    }

    /**
     * Write a method that will remove all dupplicates from string
     * removeDup("abcc"); -> "abc"
     */
    public static void removeDuplicate(String string) {
           String uniqueString= "";
        for (int i=0;i < string.length(); i++) {
            if(!uniqueString.contains(string.charAt(i) +"")) {
                      uniqueString+=string.charAt(i);
            }
//            for(int j=0;j < string.length();j++) {
//
//            }
        }
        System.out.println(uniqueString);
    }

    /**
     * Write a method that will print only unique letters of given string
     * printUnique("aabbc") -> "c" printUnique("aabc") -> "bc"
     */
    public static void uniqueLetters(String string) {
        String uniqueLetter = "";
        int count = 0;
        for(int i=0; i < string.length(); i++) {
            count=0;
            for(int j=0; j< string.length(); j++) {
                if(string.charAt(i)==string.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                uniqueLetter+=string.charAt(i);
            }
        }
        System.out.println(uniqueLetter);
    }
    public static void printUnique(String string) {
        String newStr = "";
        int count = 0;
        for (int i=0; i < string.length();i++) {
            char current = string.charAt(i);
            if(newStr.indexOf(current) < 0) { //means doesn't exist return -1
                newStr+=current;
            }else{
                newStr = newStr.replace(String.valueOf(current), "");
            }

        }
        System.out.println(newStr);

    }
    /**
     * Write a method which prints out teh numbers from 1 to 30 but for numbers
     * which are a multiple of 3, print "FIN" instead of the number and for numbers
     * which are a multiple of 5, print "RA" instead of the number for numbers which
     * are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void printNumber(int num) {
        for(int i=0; i < num; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Finra");
            } else if(i % 3 ==0) {
                System.out.println("FIN");
            } else if(i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
    /**
     * Method that prints numbers in fibonacci sequence in java. In fibonacci
     * series, next number is teh sum of previous two numbers for example 0, 1, 1,
     * 2, 3, 5, 8, 13, 21, 34, 55 etc. Teh first two numbers of fibonacci series are
     * 0 and 1. Method will accepts one int as arg. fibonacci(5); -> 0, 1, 1, 2, 3
     * fibonacci(8); -> 0, 1, 1, 2, 3, 5, 8, 13,
     */

    public static void fibonacci(int target) {

        if (target <= 0)
            return;

        int first = 0;
        int second = 1;
        int sum = 0;
        String result = "";

        // 3 -> 0, 1, 1, 2, 3,
        for (int i = sum; sum <= target; i++) {
            result += first + ", ";

            first = first + second;
            second = first - second;
            sum = first + second;
        }

        System.out.println(result + target);
    }

    /**
     * Write me a method which can identifies given number is even or odd
     * identify(5) -> print "Odd"
     * identify(6) -> print "Even"
     */
    public static void identify(int number) {

        if (number == 0)
            return;

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    /**
     * Create a method that will accept a String and returns a String with the duplicate instances of characters removed

     Ex:
     Input: "AAABBBCCCD"
     Output: ABCD
     */

    public static String removeDuplicateChars(String str) {
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        return set.toString();  // because set is not allow a duplicate value

        // if we want order or sorted bwe can use tree sort
        // if we need to maintain the orginal
    }

    /**
     * Create a method that will take any String of letters and numbers and sort each substring of numbers and letters
     Ex:
     Input: "DC501GCCCA098911"
     Output: "CD015ACCCG011899"
     */

    public static String sortEach(String str) {

        String fixedStr = "";
        ArrayList<String> eachSub = new ArrayList<>();
        boolean nextSubstring = false;

        // "DC501GCCCA098911"
        //Queue<String>  eachSub = new PriorityQueue<>();   // if we use tree set it will remove duplicate
        // with queue as eachSub, you don't need this line : Collections.Sort(eachSub);
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            eachSub.add("" + eachChar);
            if (Character.isLetter(eachChar)) {
                //We are a character
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    // is a digit, no action
                    nextSubstring = true;
                }
            } else {
                // we are a number
                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    nextSubstring = true;
                }
            }

            if (nextSubstring) {
                Collections.sort(eachSub);
                fixedStr += String.join("", eachSub);
                eachSub.clear();
            }

        }

        return fixedStr;
    }
    /**
    how to add an elment in to array
     => Make anew array or huge array
     */

    /**
     * How do you check anagram word
     */

    public static boolean checkAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
         Arrays. toString(word2.split(""));
        String [] newword1 = word1.split("");
        String [] newword2 = word1.split("");

     return false;

    }

}
