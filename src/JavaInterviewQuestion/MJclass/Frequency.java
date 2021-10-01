package JavaInterviewQuestion.MJclass;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
      String words = "aaaabbcdd";
        System.out.println("wordFrequency(words) = " + wordFrequency(words));

        System.out.println(wordFrequency2(words));
        System.out.println("with out map "+wordFrequency3(words));

    }

    public static String wordFrequency(String word) {
        //Collections.frequency ==> only use with collection framework
        //aaaabbcdd ==> a4bc1d2
        // we use map because it will remove duplicate key and also
        // count the value
        //we use LinkedHashMap because insertion order is matter.
        //we assume the word has ddsssfff==> 3d2s3f
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!map.containsKey(word.charAt(i))) {
                map.put(c, 1);
            } else { //else means the charactor is already exist inside my map

                map.put(c, map.get(c) + 1);

            }
        }

        String frequency = "";
        //what is the best way to print map<k,v> as a string
        //Map.Entery<Charactor,Integer> each : map.enterySet()

        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            frequency +=""+ each.getKey() + each.getValue();
        }
        return frequency;
    }
    //frequency of word using map
    //aaaabbcdd
    public static String wordFrequency2(String word) {
        // first let us creat a map which store word by counting
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0;i< word.length();i++) {
            Character c = word.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) +1);
            }
        }
        // until this point we are able to store the string in to map  value of charactor with the frequency
        //Now let us convert this pam in to string
        //the easiest way to convert
    String frequency = "";
        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            frequency +="" + each.getKey()+each.getValue();
        }

       return frequency;
    }

    public static String wordFrequency3(String word) {
        String newWord = "";
        int count = 0;
        String frequencey = "";
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (c == word.charAt(word.length() - 1)) {
                frequencey += c + "" + count;
                break;
            }
            if (!newWord.contains(c + "")) {
                newWord += c;
                count += 1;
            } else {
                count += 1;
            }
            if (c != word.charAt(i + 1)) {
                frequencey += c + "" + count;
                newWord = "";
                count = 0;
            }

        }
        return frequencey;
    }

}
