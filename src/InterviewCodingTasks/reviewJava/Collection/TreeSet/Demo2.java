package InterviewCodingTasks.reviewJava.Collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo2 {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(3);

        System.out.println(treeSet);
        Iterator<Integer> it = treeSet.iterator();

        while(it.hasNext()) {
            System.out.print(it.next());
            System.out.print(", ");
        }

        int first = treeSet.first();
        int last = treeSet.last();
        System.out.println();
        System.out.println(first + " and " + last);

    }
}
