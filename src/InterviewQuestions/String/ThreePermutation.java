package InterviewQuestions.String;

public class ThreePermutation {
    public static void main(String[] args) {
        String words = "TOM";
        String[] newWord = words.split(""); // [D,O,G

        for (int i = 0; i < newWord.length; i++) {
            String letter1 = newWord[i];
            String letter2 = newWord[i];
            for (int j = 0, k = newWord.length - 1; j < newWord.length; j++, k--) {
                if (newWord[i] != newWord[j]) {
                    letter1 += newWord[j];  //DOG
                }
                if (newWord[i] != newWord[k]) {  //DGO
                    letter2 += newWord[k];
                }
            }
            System.out.println(letter1);
            System.out.println(letter2);
        }
    }
}
