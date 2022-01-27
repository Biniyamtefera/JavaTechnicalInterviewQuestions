package InterviewCodingTasks.reviewJava.Collection.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("First");
        treeSet1.add("Second");
        treeSet1.add("Third");

        Iterator<String> it = treeSet1.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }

    public static void try1(String[] args) {
        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("First");

        System.out.println("treeSet1.stream().findFirst() = " + treeSet1.stream().findFirst());

    }
}
