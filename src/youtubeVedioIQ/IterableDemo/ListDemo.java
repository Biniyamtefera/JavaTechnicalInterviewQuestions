package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //list allow to add duplicate
        list.add("Biniyam");
        list.add("Biniyam");
        list.add("Biniyam");
        list.add("Biniyam");
        list.add("Biniyam");
        System.out.println(list);
   //list and null value
        list.add(null);
        list.add(null);
        System.out.println(list);

        // list maintain insertion order
        list.add("2Fisrt Add");
        list.add("Second added ");
        System.out.println(list);


    }
}
