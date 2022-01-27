package InterviewCodingTasks.reviewJava.methodex;

import java.util.Scanner;

/**Program starts and asks user to enter text
 * Program format text with next rues
 *   1. All characters in the word should become lower case
 *   2. The first letter in the word should become upper case
 *  progra print result of formatting to console

 */
public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.println(firstCharToTitleCase(userInput));
    }
    public static String firstCharToTitleCase(String string){
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++){
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
