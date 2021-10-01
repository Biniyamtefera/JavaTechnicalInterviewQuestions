package InterviewQuestions.String;

import java.util.Arrays;

/**
 Write a return method that can reverse  String
 Ex: Reverse("ABCD"); ==> DCBA

 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("ABC"));

    }

    // using methods coming from Array
    // First split the string using a dilimiter then using the for loop iterate from back word to begning
    // Then use Array.toString method and delimitter to remove comma and square brakets
    public static String reverse(String word) {
        String [] reverseWord = new String[word.length()];
         String [] newArr = word.split("");

         for (int i= 0; i < newArr.length; i++) {
             reverseWord[i] = newArr[newArr.length-1-i];
         }
        return Arrays.toString(reverseWord).replace("[", "")
                .replace("]", "").replace(", ", "");
    }
}
