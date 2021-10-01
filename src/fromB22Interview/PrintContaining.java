package fromB22Interview;

import java.util.*;

public class PrintContaining {
    public static void main(String[] args) {
        String [] strArr ={ "abbc", "abcdb", "gggh", "klsrtabcabc", "78787*79789", "aaffdfddddddddddddd"};
        char [] charArr = {'a','b','b','c'};
        List<String> charList = new ArrayList<>();

        for (char c : charArr){
            charList.add(c + "");
        }

        System.out.println("List1: " + Arrays.toString(strArr));
        System.out.println("List2: " + charList + "\n");
        System.out.println("Elements from list1 that contains all elements from list2:");

        for (String value : strArr) {
            List<String> characterList = new ArrayList<String>(Arrays.asList(value.split("")));
            if (characterList.containsAll(charList) && compareFrequency(characterList,charList)){
                System.out.println(value);
            }
        }
    }

    public static boolean compareFrequency(List<String> list1, List<String> list2){
        Set<String> objSet = new HashSet<String>(list2);

        for (String each : objSet) {
            if (Collections.frequency(list1, each) < Collections.frequency(list2, each)) {
                return false;
            }
        }
        return true;
    }


}
