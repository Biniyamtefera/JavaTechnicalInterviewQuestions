package youtubeVedioIQ.IterableDemo;

import java.util.*;

public class IterateHasSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        //1.Enhanced for loop
        for(String each: set) {
            System.out.println(each);
        }
        //2. Basic loop with iterator
         for(Iterator<String> iterator = set.iterator();iterator.hasNext();){
             String numbers = (String) iterator.next();
         }
        //3. while loop with iterator
        System.out.println("========>Basic iterator");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //4JDK forEach with Lambda
        set.forEach(el-> System.out.println(el));
        set.forEach(System.out::println);
        //5. JDK a streaming + forEach() + lambda expression
        System.out.println("=================JDK");
        set.stream().filter(num -> !"3".equals(set)).forEach(el-> System.out.println(el));

    }
}
