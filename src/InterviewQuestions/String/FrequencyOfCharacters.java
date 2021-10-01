package InterviewQuestions.String;

/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String word1 = "AAABBCDD";
        int count = 0;
        String frequencyWord = "";

        for (int i = 0; i < word1.length(); i++) {
            String eachLetter = word1.charAt(i) + "";
               count = 0;

            for (int j = 0; j < word1.length(); j++) {
                if (eachLetter.equals(word1.charAt(j) +"")) {
                    count++;
                }
            }
            if(!frequencyWord.contains(eachLetter)) {
                frequencyWord +=eachLetter + count;
            }
        }

        System.out.println(frequencyWord);

    }

    /*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


}

