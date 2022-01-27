package JavaInterviewQuestion.LiveInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortLetterAndNumber {
    public static void main(String[] args) {

        /**
         * Create a method that will take any String of letters and numbers and sort each substring of numbers and letters
         Ex:
         Input: "DC501GCCCA098911"
         Output: "CD015ACCCG011899"
         */

        String str = "DC501GCCCA098911";
        System.out.println(sortString1(str));

    }
    public static void sortString(String str) {
      char[] c = str.toCharArray();
       // List<String> listStr = new ArrayList<>(Arrays.asList(str.split("")));
        List<String> listStr = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();
        for (int i=0; i<str.length(); i++) {
            if(Character.isDigit(c[i]) && Character.isDigit(c[i+1])) {
                listStr.add(c[i]+"");
            }
        }
    }

    public static String sortString1(String word) {
        String temp = "";
        String result = "";

        for(int i=0;i < word.length(); i++) {
            char eachChar = word.charAt(i);

            if(i==word.length()-1) {
                temp +=eachChar;
                char [] arr = temp.toCharArray();
                Arrays.sort(arr);
                result += String.valueOf(arr);
                break;
            }

            if(Character.isLetter(eachChar)) {  //D  C
                temp +="" + eachChar; //DC
                if(!Character.isLetter(word.charAt(i+1))) {
                    char[] arr = temp.toCharArray(); //D ,C
                    Arrays.sort(arr); //CD
                    result += String.valueOf(arr); // convert to string
                    temp ="";
                }
                }

            if(Character.isDigit(eachChar)) {
                temp +=eachChar;
                if(!Character.isDigit(word.charAt(i+1))) {
                    char[] arr = temp.toCharArray();
                    Arrays.sort(arr);
                    result += String.valueOf(arr);
                    temp ="";
                }
            }

        }
        return result;
    }




}
