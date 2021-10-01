package Book;

public class Q16StringContainSubstring {
    public static void main(String[] args) {
        System.out.println("containSubstring(\"Ethiopia\", \"pi\") = " + containSubstring("Ethiopia", "pi"));
        System.out.println("containSubstring2(\"Ethiopia\", \"pi\") = " + containSubstring2("Ethiopia", "pi"));
    }

    public static boolean containSubstring(String word, String str) {
        return word.contains(str);
    }

    /**
     * Alternatively, a solution can be implemented by relying on String.indexOf() (or String.lastIndexOf()), as follows:
     */

    public static  boolean  containSubstring2(String text, String sus) {
        if(text.indexOf(sus)!=-1) {
            return true;
        }
        return false;
    }
}
