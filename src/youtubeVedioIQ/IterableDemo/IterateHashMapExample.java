package youtubeVedioIQ.IterableDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class IterateHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Biniyam", 40);
        map.put("rediet",12);
        map.put("Mimi",8);
        map.put("Mami",35);
        System.out.println("map.toString() = " + map.toString());

        //1. Iterate through a HashMap EntrySet Using Iterator
         Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
         while(iterator.hasNext()) {
             Map.Entry<String,Integer> entry= iterator.next();
             System.out.println(entry.getKey());
             System.out.println(entry.getValue());
         }

        //2. Iterate through HashMap KeySet using Iterator
        System.out.println("Iterate through HashMap KeySet using Iterator");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
            System.out.println("map.get(it.next()) = " + map.get(key));

        }
        //3. Iterate HashMap using for-each loop/Enhanced loop
              for(Map.Entry<String, Integer> entry : map.entrySet()) {
                  System.out.println("entry.getKey() = " + entry.getKey());
                  System.out.println(entry.getValue());
              }
        System.out.println("========>Lambda expression");
        //4. Iterating through a HashMap using Lambda expression
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

        //5. Loop through a HashMap Using Stream API
        System.out.println(" API");
        map.entrySet().stream().forEach((entry)-> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });



    }
}
