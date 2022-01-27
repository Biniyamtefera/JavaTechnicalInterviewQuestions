package InterviewCodingTasks.reviewJava.methodex;

import java.util.Scanner;

/**
 * program starts and ask user to enter text
 * program calls specic function which take one parameter of String type and returns amount of words in the text
 */
public class AmountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String userInput = sc.nextLine();

        int amountOfWords = getWordsAmount(userInput);
        System.out.println(amountOfWords);
    }

    public static int getWordsAmount(String text){
        return text.split(" ").length;
    }
}
