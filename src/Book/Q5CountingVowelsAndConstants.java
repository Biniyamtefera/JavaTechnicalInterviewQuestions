package Book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q5CountingVowelsAndConstants {

    public static void main(String[] args) {
        String word = "bananaok";

       numberOfVowelsAndConstant(word);

    }

    public static void numberOfVowelsAndConstant(String str) {
        int vowel = 0;
        int constant = 0;

        String str1 = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char char1 = str1.charAt(i);
            if((char1=='a'||char1=='e') ||(char1 =='i' ||char1 =='o') || char1=='u') {
                vowel +=1;
            }else if(char1 < 'z' && char1 > 'a'){  // to check other unexpected letter might have mixed
                constant +=1;
            }
        }
        System.out.println("vowel = " + vowel);
        System.out.println("constant = " + constant);

    }

   //there are In Java 8 functional style, this code can be rewritten using chars() and filter():
}
