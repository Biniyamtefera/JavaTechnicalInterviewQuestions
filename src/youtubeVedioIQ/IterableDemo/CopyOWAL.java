package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CopyOWAL {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Carrot");
        fruits.add("Potato");

        Iterator<String> it = fruits.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if(str.equals("Carrot")) {
                fruits.remove("Carrot");
            }
            if(str.equals("Potato")) {
                fruits.add("Banana");
            }
        }
        System.out.println(fruits);
    }

}
