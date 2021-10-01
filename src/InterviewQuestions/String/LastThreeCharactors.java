package InterviewQuestions.String;

/*
 Write a method which return the last three character of the string
 */
public class LastThreeCharactors {
    public static void main(String[] args) {
      lastThreeChar("wolf");
    }
    public static void lastThreeChar(String str) {
   // Assume the string is three or more characters
        String lastChar = "";
        for (int i = str.length()-1; i > (str.length()-4); i--) {
          lastChar = str.charAt(i) + lastChar;
        }
        System.out.println(lastChar);
    }
}
