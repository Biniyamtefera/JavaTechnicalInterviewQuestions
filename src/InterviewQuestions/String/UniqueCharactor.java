package InterviewQuestions.String;

/*
 Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

 */
public class UniqueCharactor {
    public static void main(String[] args) {
        System.out.println(uniqueLetter("AAABBBCCCDEF"));
        System.out.println("hellow");
    }

    public static String uniqueLetter(String word) {
        String uniqueWord = "";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char eachLetter = word.charAt(i);
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (eachLetter == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueWord += eachLetter + "";
            }
        }
        return uniqueWord;
    }
}
