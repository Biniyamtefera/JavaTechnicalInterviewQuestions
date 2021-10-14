package youtubeVedioIQ.IterableDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        List<String> course = new ArrayList<String>(Arrays.asList("Java","c++","Selenium","Cucumber"));
        //Ways of iterating List

        System.out.println("=====>Using Iterator");
        Iterator<String> it = course.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=====>Enhanced for loop");
        //Advanced foreach loop
        for(String each :course) {
            System.out.println(each);
        }
        //for each loop
        System.out.println("====>forEach loop");
        course.forEach(el -> System.out.println(el));

        System.out.println("====>Using method Reference ");
        course.forEach(System.out::println);

        //using java 8 stream
        course.stream().forEach(ea-> System.out.println(ea));

        //java 8 forEach + lamda



    }
}
