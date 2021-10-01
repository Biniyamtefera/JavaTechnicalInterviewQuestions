package Book;
/**
 Joining multiple strings with a delimiter
 delimiter is
 */
public class Q9JoinMultipleString {
    public static void main(String[] args) {
        System.out.println("joinByDelimiter('^', \"Biniyam\") = " + joinByDelimiter('^', "Biniyam"));
    }

    /**
     There are several solutions that fit well and solve this problem. Before Java 8,
     a convenient approach relied on StringBuilder, as follows:
     */

    public static String joinByDelimiter(char delimiter, String...args) {
        StringBuilder result = new StringBuilder();
        int i =0;
        for ( i = 0; i < args.length -1 ; i++) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return  result.toString();
    }
}
