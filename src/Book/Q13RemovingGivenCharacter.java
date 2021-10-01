package Book;

public class Q13RemovingGivenCharacter {
    public static void main(String[] args) {
        System.out.println("removeCharacter(\"Biniyam\", i) = " + removeCharacter("Biniyam", 'i'));
        System.out.println("removeCharacter2(\"Biniyam\", 'i') = " + removeCharacter2("Biniyam", 'i'));
    }

    //Let us assume string is the given parameter
    public static String removeCharacter(String word, char c) {
        String newWord = word.replaceAll(String.valueOf(c), "");

        return newWord;
    }
    public static String removeCharacter2(String word, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
           char each = word.charAt(i);
           if(each!=c) {
               sb.append(each);
           }
        }
        return sb.toString();
    }
}
