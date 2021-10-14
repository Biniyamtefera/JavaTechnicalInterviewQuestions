package earlyBirdQuestion;

import java.lang.reflect.Array;
import java.util.*;

public class AlphabetCheck {
    public static void main(String[] args) {

        String sentence = "We will get a good company";
        //check the letters how many time appeared and put in map and key the result
        /**
         * out should be
         * A= 0; 0 =3, a=2 , B=0
         */

        ArrayList<String> newList = new ArrayList<>(Arrays.asList(sentence.replaceAll(" ", "").split("")));
        System.out.println(newList);
        Map<String, Integer> ourMap = new HashMap<>();

        for (char i = 'A', j = 'a'; i <= 'Z'; i++, j++) {
            ourMap.put(i + "", 0);
            ourMap.put(j + "", 0);
        }
        System.out.println(ourMap);
        for (int i = 0; i < newList.size(); i++) {
            int count = ourMap.get(newList.get(i));
            ourMap.put(newList.get(i), count + 1);
            count = 0;
        }
        System.out.println(ourMap);

    }

    public static void countLetter() {
        String sentence = "We will get a good company!";
        ArrayList<String> ourList = new ArrayList<String>(Arrays.asList(sentence.split("")));

        Map<Character,Integer> ourMap = new LinkedHashMap<>();
        for (int i = 65; i < 122; i++) {
            if(i >=91 &&i <=96) {
                continue;
            }
            char letter = (char)i;
            ourMap.put(letter, 0);
        }
        for (int j = 0; j <sentence.length() ; j++) {
            if(sentence.charAt(j) >=32 && sentence.charAt(j)<=64){
                continue;
            }
            ourMap.put(sentence.charAt(j), Collections.frequency(ourList, sentence.charAt(j)+""));
        }
        System.out.println("Our map " + ourMap);
    }



}
