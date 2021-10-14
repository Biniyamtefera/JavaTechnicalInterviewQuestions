package youtubeVedioIQ.IterableDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCLass {
    public static void main(String[] args) {
        //implement both List and Queue, Deque interface
        //formed with nodes //doulble link is collection of three part Pointers  ==> Node
        //Not synchronized
        // ArrayList internally used Aray
        //Linked list is use double link internally and consume more memory
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Biniyam");
        linkedlist.add("Mekdes");
        linkedlist.addFirst("Mimi");
        linkedlist.addLast("Redu");

        System.out.println(linkedlist);

        Iterator it = linkedlist.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        linkedlist.forEach(System.out::println);
        linkedlist.forEach(System.out::println);

        linkedlist.add(1, "Gashea");
        System.out.println(linkedlist);

        //How to retrive an element from linked list


        //how to get the first element from linked list
        System.out.println("linkedlist.getFirst() = " + linkedlist.getFirst());

        //how to get the last elment
        System.out.println("linkedlist.getLast() = " + linkedlist.getLast());

        //hpw to get specific elemt from linked list
        System.out.println("linkedlist.get(3) = " + linkedlist.get(3));

        //how to get all the element from linked list
        // there are more way to retrive all element from linked list
        // foreach, lamda, iterator,

        for (String ele:linkedlist
             ) {
            System.out.println(ele);

        }

        //How to remove element from linked list

        //how to remove first elment
        System.out.println("linkedlist.removeFirst() = " + linkedlist.removeFirst());
        //remove last elemnt of linked list
        System.out.println("linkedlist.removeLast() = " + linkedlist.removeLast());
        System.out.println("linkedlist.removeFirstOccurrence(\"Biniyam\") = " + linkedlist.removeFirstOccurrence("Biniyam"));
        //remove first occurence
        System.out.println("linkedlist.removeLastOccurrence(\"Mimi\") = " + linkedlist.removeLastOccurrence("Mimi"));

        LinkedList<String> li2 = new LinkedList<>();
        linkedlist.forEach(System.out::println);
        System.out.println("linkedlist.addAll(linkedlist) = " + li2.addAll(linkedlist));
        li2.forEach(System.out::println);
        System.out.println(li2);
        li2.clear();
        li2.forEach(System.out::println);

        linkedlist.add(1, "Mitu");
        linkedlist.add("Etaba");
        boolean con = linkedlist.contains("Mekdes");

        // Find the index of the last occurence of linked list
        linkedlist.add("Mekdes");
        int firstOcuurence = linkedlist.indexOf("Mekdes");
        int lastOccrence = linkedlist.lastIndexOf("Mekdes");
        System.out.println(firstOcuurence);
        System.out.println(lastOccrence);

        //Iterator
        Iterator<String> iterator1 = linkedlist.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        //forEach
        linkedlist.forEach(System.out::println);
        //for each advanced
        for (String s : li2) {
            System.out.println(s);
        }
        //simple for loop

    }
}
