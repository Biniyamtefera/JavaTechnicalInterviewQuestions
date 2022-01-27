package InterviewCodingTasks;

public class String_FirstUniqueCharacter {

    /*
    write a program that can return the first non-repeated character from a string
     */
    public static void main(String[] args) {
        String str = "Bainyinyam";
        firstNonRepeatedChar2(str);
        System.out.println("firstNonRepeatingChar(str) = " + firstNonRepeatingChar(str));
    }
    public char firstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                return str.charAt(i);
            }

        }

        return ' ';

    }

    // here we are required to return all non repeating character
    public static void firstNonRepeatedChar2(String str) {
        int count = 0;
        String str1 = "";
        for (int i=0; i < str.length(); i++) {
            count=0;
            char Char = str.charAt(i);

            for(int j=0; j < str.length(); j++) {
                if(Char == str.charAt(j)) {
                    count++;
                }

            }
            if(count==1 & !str1.contains(Char + "")) {
                str1 +=Char +"";
                System.out.println(Char);
            }
        }
    }
    // now let us find the first non-repeating charactor
    public static char firstNonRepeatingChar (String str) {
        int count =0;
        for (int i=0; i < str.length(); i++) {
            char char1 =str.charAt(i);
            for (int j=0; j < str.length(); j++) {
                if(char1==str.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                return char1;
            }
        }
        return '0';
    }


}
