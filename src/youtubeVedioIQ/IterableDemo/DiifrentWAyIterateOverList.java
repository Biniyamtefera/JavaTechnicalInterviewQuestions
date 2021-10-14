package youtubeVedioIQ.IterableDemo;

import javax.lang.model.type.MirroredTypeException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DiifrentWAyIterateOverList {
    public static void main(String[] args) {
        List<String> course = Arrays.asList("C++","Java","Pyton","Spring");
        System.out.println(course);
        for (String each: course) {
            System.out.println(each);
        }

        System.out.println("List iterator");
        ListIterator<String> lI = course.listIterator();
        while (lI.hasNext()) {
            String elment = lI.next();
            System.out.println(elment + " my writing skill");
            if(elment.equals("Java"))
            System.out.println("I love java");
        }
        System.out.println("Back ward direction iteration");
        //PreviousNext()
        //Previous()

        while (lI.hasPrevious()) {
            System.out.println(lI.previous());
        }
        //iterator  with while loop
//        for(Iterator  it = course.iterator();it.hasNext();) {
//
//        }

        //iterator with while loop
        Iterator<String> it = course.iterator();
        while(it.hasNext()) {
            String course1 = (String) it.next();
            System.out.println(course);
        }

        //Using java 8 stream
        System.out.println("Using Java 8");
        course.forEach(System.out::println);
        course.stream().forEach(bini-> System.out.println(bini));


    }
}
