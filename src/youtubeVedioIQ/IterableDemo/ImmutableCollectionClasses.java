package youtubeVedioIQ.IterableDemo;

import java.util.*;

public class ImmutableCollectionClasses {
    public static void main(String[] args) {
        //ArrayList -Collections.unmodifiableList() and list.of() method (java 9)
        //HashSet -Collections.unmodifiableSet() and Set.of() method (java 9)
        //HashMap -Collections.unmodifiableList(numberMapping) and Map.ofEntries() method (java 9)

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Carrot");
        fruits.add("Pepper");

        //before Java 8
       fruits = Collections.unmodifiableList(fruits);

        //after java 9
        List<String> fruit2 = List.of("1","2","3","4");
        //fruit2.add("5");   //.==>UnsupportedOperationException


        // immutable set
        Set<String> set = new HashSet<>();
         set.add("1");
         set.add("2");
         set.add("3");
         set.add("4");

         set = Collections.unmodifiableSet(set);
         Set<String> set2 = Set.of("1","2","3","5");

         //====>unmodifable map
        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map = Collections.unmodifiableMap(map);
        // map.put("D",5);   =====> UnsupportedOperationException

        //After Java 9
        Map<String,Integer> map2 =Map.ofEntries(
                Map.entry("2", 2),
                Map.entry("3", 3),
                Map.entry("4", 4));


    }
}
