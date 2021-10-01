package earlyBirdQuestion;

import java.util.*;

public class ChangeMap {
    /**
     *  Write a method which will take List<String> as parameter and return  Map<String,Integer>
     *     ,which contains only entities started from letter "A".As a map key use
     *     Input string: List<String> names = Arrays.asList("Alex","Bob","Alice","Jack");
     *     Output: Map<String,Integer> map = {Alex=4, Alice=5};
     *     Suggestion for candidates: use Java streams feature
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Alex","Bob","Alice","Jack"));
        System.out.println("changeList(list) = " + changeList(list).toString());
    }
    public static Map<String, Integer> changeList(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String each : list) {
            if(each.indexOf(0)=='a') {
                map.put(each, each.length());
            }
        }
        return map;
    }

}
