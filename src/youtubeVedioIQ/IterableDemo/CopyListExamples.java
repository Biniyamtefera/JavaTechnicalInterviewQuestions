package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyListExamples {
    public static void main(String[] args) {
        //Copy List into another list in Java
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Oranges");
        fruits.add("Carrots");
        fruits.add("Potatos");
        fruits.add("Banana");
        //1. Using constructor
          List<String> copy = new ArrayList<>(fruits);
        System.out.println(copy);

        //2. using addAll()
        List<String> addAll = new ArrayList<>();
        addAll.addAll(fruits);
        System.out.println(addAll);

        //3Using Collections.copy()
        //The size of the the source and the ditination
        List<String> copy3 = new ArrayList<>(fruits.size());
        copy3.add("a");
        copy3.add("b");
        copy3.add("c");
        copy3.add("d");
        copy3.add("e");
        Collections.copy(copy3, fruits);
        System.out.println("3Using Collections.copy()");
        System.out.println(copy3);

        //4. Using java 8
        List<String> copy4 = fruits.stream().collect(Collectors.toList());
        System.out.println(copy4);

        //we using Stream API
        //5 using java 10

        List<String> copy5 = List.copyOf(fruits);



    }
}
