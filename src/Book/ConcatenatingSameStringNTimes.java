package Book;

import java.util.Collections;

public class ConcatenatingSameStringNTimes {
    public static void main(String[] args) {
        System.out.println(concatRepeat("Biniyam", 5));
        System.out.println(concatRepeat2("Biniyam",5));
        System.out.println(concatRepeat3("Biniyam", 5));
    }


    /**
    Using string builder
     */
    public static String concatRepeat(String str, int n) {

        StringBuilder sb = new StringBuilder(str.length() * n);

        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static String concatRepeat2(String str, int n) {
        String strRepeat = "";
        for(int i=0; i < n; i++) {
            strRepeat +=str;

        }
        return strRepeat;
    }
    /**
     Starting with JDK 11, the solution relies on the String.repeat(int count) method.
     This method returns a string resulting from concatenating this string count times.
     Behind the scenes, this method uses System.arraycopy(), which makes this very fast:
     */

    public static String concatRepeat3(String str, int n) {
        String result = str.repeat(n);
        return result;
    }

    public  static String concatRepeat4(String str, int n) {
        String result = String.join("", Collections.nCopies(n, str));
        return result;
    }
}
