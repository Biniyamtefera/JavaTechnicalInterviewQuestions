package Book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q12RemovingDuplicate {
    public static void main(String[] args) {

        String word = "Biniyam";
        System.out.println("removeDuplicate(word) = " + removeDuplicate(word));
        System.out.println("removeDuplicate2(word) = " + removeDuplicate2(word));
        System.out.println("removeDuplicate3(word) = " + removeDuplicate3(word));

    }

    public static String removeDuplicate(String word) {  //Biniyam
        String uniqueWord = "";
        int count = 0;
        for (int i = 0; i < word.length(); i++) { //B
            count = 0;
            for (int j = 0; j < word.length(); j++) {  //B
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                uniqueWord += word.charAt(i);
            }
        }
        return uniqueWord;
    }

    public static String removeDuplicate2(String word) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * The next solution relies on a collaboration between HashSet and StringBuilder. Mainly,
     * HashSet ensures that duplicates are eliminated, while StringBuilder stores the resulting string.
     * If HashSet.add() returns true, then we add the character in StringBuilder as well:
     */

    public static String removeDuplicate3(String word) {


        StringBuilder sb =new StringBuilder();
        Set<Character> set = new HashSet<>();

        char[] newChar = word.toCharArray();

        for (char c : newChar) {
            if(set.add(c)==true) {  // if previously exist the character the become false
                sb.append(c);
            }
        }


        return sb.toString();
    }


    /**
     *First, the solution converts the given string into Stream<String>,
     * where each entry is actually a single character. Furthermore,
     * the solution applies the stateful intermediate operation, distinct().
     * This operation will eliminate duplicates from the stream, so it returns a stream without duplicates.
     * Finally, the solution calls the collect() terminal operation and relies on Collectors.joining(),
     * which simply concatenates the characters into a string in the encounter order.
     */
    public static String removeDuplicates(String str) {

        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }

}
