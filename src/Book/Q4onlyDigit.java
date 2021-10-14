package Book;

public class Q4onlyDigit {
    public static void main(String[] args) {
        String str1 = "34444245";
        System.out.println("isOnlyDigit(str1) = " + isOnlyDigit(str1));
        System.out.println("isMatch(str1) = " + isMatch(str1));
        System.out.println("containsOnlyDigit(str1) = " + containsOnlyDigit(str1));
    }

    /**
     *  Checking whether a string contains only digits
     */

    //method 1
    public static boolean isOnlyDigit(String str) {
        // The solution for this is rely on Charactor.isString
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //method2

    public static boolean isMatch(String str) {

        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }
    //method 3
    //String.match(regx)=> check whether or not this string matches the given regular expression
    //Pattern.matches(regex, str).
    //This method returns true if, and only if, this string matches the given regular expression.

    public static boolean containsOnlyDigit(String str) {
        return  str.matches("[0-9]+");
    }

}
