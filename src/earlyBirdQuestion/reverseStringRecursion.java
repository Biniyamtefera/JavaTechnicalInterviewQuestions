package earlyBirdQuestion;

public class reverseStringRecursion {
    public static void main(String[] args) {
        String str = "I love java";
        int lastIndex = str.length()-1;
        reverseString(str, lastIndex);


    }

    public static void reverseString(String word, int index){
        System.out.print(word.charAt(index));

        while (index >= 1) {
            reverseString(word, --index);
            break;
        }
    }

    public static String reverseString2(String word) {
        if(word.isEmpty()){
            return word;
        }
        return reverseString2(word.substring(1)) + word.charAt(0);
    }
}
