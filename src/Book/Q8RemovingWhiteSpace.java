package Book;

/**
 * 8. Removing white spaces from a string
 */
public class Q8RemovingWhiteSpace {
    public static void main(String[] args) {
        String str = " Bini yam ";
        System.out.println("removeWhiteSpace(str) = " + removeWhiteSpace(str));
        System.out.println("removeWhiteSpace2(str) = " + removeWhiteSpace2(str));
    }

    /**
     * he difference between replace() and replaceAll() method is that the replace() method
     * replaces all the occurrences of old char with new char while replaceAll() method replaces
     * all the occurrences of old string with the new string.
     * @param word
     * @return
     */
    public static String removeWhiteSpace(String word) {
        return  word.replaceAll(" ", "");
    }
    public static String removeWhiteSpace2(String word) {
        return  word.replace(" ", "");
    }
}
