package youtubeVedioIQ.NavinIQ;

public class isAlphabet {
    public static void main(String[] args) {
        isAlphabet('8');
    }
    public static void isAlphabet(char ch) {
        boolean isAlphabet = false;
        if(Character.isAlphabetic(ch)) {
            isAlphabet = true;
        } else{
            isAlphabet = false;
        }
        if(isAlphabet) {
            System.out.println(ch + " is Alphabet");
        } else {
            System.out.println(ch + " is not Alphabet");
        }
    }
}
