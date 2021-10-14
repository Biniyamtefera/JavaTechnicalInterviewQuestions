package youtubeVedioIQ.IterableDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

    public static void main(String[] args) {
        //HashSet doesn't contain duplicate element
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1"); //overrite the existone and print the new one
        //display only one element
        System.out.println(set.toString());

        //Allows one null value
        set.add(null);
        set.add(null);
        System.out.println(set.toString());

        //HashSet doen't maintain insertion order
        set.add("1");
        set.add("2");
        set.add("6");
        set.add("4");
        set.add("5");
        System.out.println(set);

        //HashSet is not threadSet if you use hashset in multithread then use explicitly syncorize
    }
}
