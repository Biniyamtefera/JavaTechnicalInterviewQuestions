package youtubeVedioIQ.IterableDemo;

import java.util.*;

public class IteraterInterfaceOverview {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Mango")) {
                it.remove();
            }
        }
        System.out.println(fruits);

        Set<String> set = new HashSet<>(fruits);
        Iterator<String>  itSet = set.iterator();
        while (itSet.hasNext()) {
            if(itSet.next().equals("Apple")) {
               // set.add("Sunflower"); ==>  concurrent modificationException

            }
        }
        System.out.println(set);
        System.out.println("Map Iteration");
        Map<String, Integer> map = new HashMap<>();
         map.put("1",10);
         map.put("2",20);
         map.put("3",30);
         map.put("4",40);
         Iterator<Map.Entry<String,Integer>> itMap = map.entrySet().iterator();
         while(itMap.hasNext()) {
             System.out.println("itMap.next() = " + itMap.next());

         }
        System.out.println(map.toString());
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int value   = map.get(key);
            System.out.println(key + " = " + value );
        }

        Iterator<Integer> iterator1 = map.values().iterator();
        System.out.println("=========Iteration with value");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }

    }
}
