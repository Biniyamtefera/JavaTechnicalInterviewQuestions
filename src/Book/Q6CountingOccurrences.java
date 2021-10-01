package Book;

public class Q6CountingOccurrences {
    public static void main(String[] args) {

        String str = "banana";
        System.out.println("countOccurrences(str) = " + countOccurrences(str));
        System.out.println("countOccurrencesOfACertainCharacter(str, a) = " + countOccurrencesOfACertainCharacter(str,'a'));

    }

    /**
     * Counting the occurrences of a certain character
     *
     * Replace every occurrence of the character in the given string with "" (basically,
     * this is like removing all of the occurrences of this character in the given string).
     * Subtract the length of the string that was obtained in the first step from the length of the initial string.
     */

    public static int countOccurrences(String word) {
         // count the occurrence of &^%
        int wordLength1 = word.length();
        String word2 ="";
        for (int i = 0; i < word.length() ; i++) {

            if (word.contains("a")) {
               word2 = word.replace("a","");
            }

        }
        int wordLength2 = word2.length();

        return wordLength1-wordLength2;
    }

    public static int countOccurrencesOfACertainCharacter(String word, char ch) {
        return word.length()-word.replace(String.valueOf(ch), "").length();
    }


    // simple for loop

    public static int countOccurrencesOfACertainCharacter1(
            String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static Long countOccurrencesOfACertainCharacter3(
            String str, char ch) {

        return str.chars().filter(n -> n ==ch).count();

    }


}
