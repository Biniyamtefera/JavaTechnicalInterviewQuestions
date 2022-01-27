package JavaInterviewQuestion.LiveInterview;

public class buildSameLetter {
    public static void main(String[] args) {

    }

    /**
     * Write a method that check if a string is build out of the same letters as
     * another string same("abc","cab"); -> true same("abc","abb"); -> false
     */

    public static boolean buildSameLetter(String str1,String str2) {
        boolean buildSameLetter = true;
         if (str1.length()!=str2.length()) {
             return false;

         }
        for (int i = 0; i < str2.length(); i++) {
            if(!str1.contains(str2.charAt(i)+"")) {
                buildSameLetter = false;
                break;
            }
        }
      return buildSameLetter;
    }
}
