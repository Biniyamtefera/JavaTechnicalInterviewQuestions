package InterviewQuestions.String;

import java.util.Arrays;

/**
 * Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
 * sort the individual string and append them back together
 * Ex:
 * Input:  "Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
 * Ex:
 * Input:  "DC501GCCCA098911"
 * OutPut: "CD015ACCCG011899""
 * OutPut: "CD015ACCCG011899"
 */
public class SortLetterAndNumber {
    public static void main(String[] args) {

        String word = "DCF501GCCCA098911KGB";
        String temp = "";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);

            if (i == word.length() - 1) {
                char[] arr = temp.toCharArray();
                Arrays.sort(arr);
                result += String.valueOf(arr);
                break;

            }

            if (Character.isLetter(eachChar)) {
                temp += "" + eachChar;
                if (!Character.isLetter(word.charAt(i + 1))) {
                    char[] arr = temp.toCharArray(); // to sort this letter I have to convert to array
                    Arrays.sort(arr); // sort it out
                    result += String.valueOf(arr);
                    temp = "";
                }
            }
            if (Character.isDigit(eachChar)) {
                temp += eachChar;
                if (!Character.isDigit(word.charAt(i + 1))) {
                    char[] arr = temp.toCharArray(); // to sort this letter I have to convert to array
                    Arrays.sort(arr); // sort it out
                    result += String.valueOf(arr);
                    temp = "";
                }
            }

        }

        System.out.println(result);
        System.out.println(sortString("DCA"));
    }

    // Write a methode to sort a string.
    // Example String words = "DCA"; ==> ACD

    public static String sortString(String words) {
        String result = "";
         char [] charArr = words.toCharArray();
        Arrays.sort(charArr);
        result = String.valueOf(charArr);
        return  result;
    }
}
