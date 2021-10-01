package Book;

public class CQ18_Anagram {
    /**
     Checking whether two strings are anagrams
     */
    public static void main(String[] args) {
         isAnagram("java", "vaja");
    }

    /**
     Two strings that have the same characters, but that are in a different order, are anagrams.
     Some definitions impose that anagrams are case-insensitive and/or that white spaces (blanks) should be ignored.
     So, independent of the applied algorithm, the solution must convert the given string into lowercase and remove
     white spaces (blanks).
     ==?the first solution mentioned sorts the arrays via Arrays.sort() and will check their equality via Arrays.equals().
     The other solution
     =>For each character from the first string, this solution increases the value in this array corresponding
     to the ASCII code by 1
     =>For each character from the second string, this solution decreases the value in this array
     corresponding to the ASCII code by 1
     */

    private static final int EXTENDED_ASCII_CODES = 256;
    public static boolean isAnagram(String str1, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length) {
            return false;
        }
        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }
        for (int i = 0; i < chCounts.length; i++) {
            if (chCounts[i] != 0) {
                return false;
            }

        }
        return true;
    }

   // At the end of this traversal, if the given strings are anagrams, then this array contains only 0.

}
