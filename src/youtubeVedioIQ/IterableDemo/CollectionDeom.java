package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDeom {

    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Orange");
        fruitCollection.add("BApple");
        fruitCollection.add("Perry");
        fruitCollection.add("berry");
        fruitCollection.add("Quenna");
        fruitCollection.add("Avocado");

        System.out.println(fruitCollection);
        System.out.println("fruitCollection.remove(\"orange\") = " + fruitCollection.remove("Orange"));
        System.out.println(fruitCollection);
        System.out.println("New print out");
        fruitCollection.forEach(System.out::println);
       // fruitCollection.forEach(System.out::println);
//        fruitCollection.stream().toArray();
//        System.out.println(fruitCollection);
       // fruitCollection.toArray();
        fruitCollection.removeIf(el -> el.equals("berry"));
        System.out.println("fruitCollection = " + fruitCollection);
    }

}
