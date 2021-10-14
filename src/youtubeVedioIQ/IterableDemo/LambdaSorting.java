package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSorting {
    public static void main(String[] args) {
        //Sorting List of Integer in Ascending and descending order
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(30);
        //Tradational sort list
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        
        //Sort List of employee object (by salary) in ascending and descending order using Comparator(anonymous class)

        //Sort List of employee object(by name) in ascending and descending order using comparator(anonymous class)
        //Sort List of employee object(by salary) in ascending and descending order using comparator(Lambda expression)
        //Sort List of employee object(by name ) in ascending and descending order using comparator(Lambda expression)
    }
}
