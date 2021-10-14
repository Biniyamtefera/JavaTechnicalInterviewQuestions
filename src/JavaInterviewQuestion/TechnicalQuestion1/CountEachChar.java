package JavaInterviewQuestion.TechnicalQuestion1;

import java.util.HashMap;
import java.util.Map;

public class CountEachChar  {
    public static void main(String[] args) {
        /**
         * Write a method that will count number of each char in a String
         * countChar("abbc"); -> {a=1, b=2, c=1}
         */
        countChar("aabbcckkkwweed");
        String str = "aabbcckkkwweed";
        countChar2(str);

    }

    public static void countChar(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); ) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            System.out.print(string.charAt(i) + "=" + count + " ");
            count = 0;
            string = string.replaceAll("" + string.charAt(i), "");

        }
    }

    public static void countChar2(String str) {
        Map<Character, Integer> map = new HashMap();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i);
            // count = map.get(strChar);
            if (map.get(strChar) != null) {
                map.put(str.charAt(i), map.get(strChar) + 1);
            } else {
                map.put(str.charAt(i), count + 1);
            }

        }

        System.out.println(map);
    }
}
