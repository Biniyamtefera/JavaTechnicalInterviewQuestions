package Book;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q10GeneratingAllPermutations {

     /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

    public static void main(String[] args) {

        char [] charWord = {'a','b','c'};
        allPermutation(charWord);

        printPermutation(charWord);

    }

    public static void allPermutation(char[] ch) {

        String word1 = "";
        String word2 = "";

        for (int i = 0; i < ch.length; i++) {
            word1 = ch[i] + "";
            word2 = ch[i] + "";
            for (int j = 0, k = ch.length - 1; j < ch.length; j++, k--) {
                if (ch[i] != ch[j]) {
                    word1 += "" + ch[j];
                }
                if (ch[i] != ch[k]) {
                    word2 += "" + ch[k];
                }
            }
            System.out.println(word1);
            System.out.println(word2);
        }
    }

    public static void printPermutation(char[] ch) {
        for (String s : permutation(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }
    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }
}
