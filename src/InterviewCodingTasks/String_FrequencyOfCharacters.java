package InterviewCodingTasks;

import java.util.*;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "BiniyBaam";
        frequencyCharacter(str);
    }
    // solution 1
    public String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }


    // solution 2
    public String frequencyOfChars2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;
    }


    // solution 3
    public String frequencyOfChars3(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }
            result += b.substring(j, j + 1) + count;
        }

        return result;

    }




    //solution 4
    public String frequencyOfChars4(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }

    public static void frequencyCharacter(String str) {
        int count = 0;
        String str1 = "";

        for(int i=0;i<str.length(); i++) {
            char char1= str.charAt(i);
            count =0;
            for (int j = 0; j < str.length(); j++) {
                if(char1==str.charAt(j)) {
                    count++;
                }
            }
            if(!str1.contains(char1 + "")) {
                str1 +=char1 +"";
                System.out.println(char1 + "  is exist " + count);
            }
        }
    }

}
