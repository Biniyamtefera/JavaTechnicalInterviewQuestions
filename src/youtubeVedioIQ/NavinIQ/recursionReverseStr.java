package youtubeVedioIQ.NavinIQ;

public class recursionReverseStr {
    public static void main(String[] args) {
        String word = "I love you";
    }
    public static String reverseString(String word) {

        // a function call it self until the memory full unless we put some condition to break the loop
        if(word==null||word.length()==1) {
            return word;
        }
        return reverseString(word.substring(1)) + word.charAt(0);
    }
}
