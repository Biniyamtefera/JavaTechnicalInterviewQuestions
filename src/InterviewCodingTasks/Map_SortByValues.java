package InterviewCodingTasks;

import java.util.*;

public class Map_SortByValues {

    /*
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",1);
        map.put("C",7);
        map.put("D",2);

        System.out.println("sortByValue(map) = " + sortByValue(map));

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

}
