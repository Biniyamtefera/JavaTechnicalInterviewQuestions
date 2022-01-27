package InterviewCodingTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {
        String str = "Binaiyam";
       Frequency(str);
    }
    public static void FrequencyTest(String  str ) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }

        System.out.println(map);

    }

    public static void Frequency(String str) {
        int count = 0;
        String word ="";
        for(int i=0 ; i< str.length();i++){
            count=0;
            for(int j=0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count +=1;

                }

                }
            if(!word.contains(str.charAt(i)+"")) {
                word +=str.charAt(i);
                System.out.println(str.charAt(i)+":"+count);
            }
        }
    }



}
