package revision;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Java");
        arr1.add("Selenium");
        arr1.add("Cake");
        arr1.add("Book");
        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Testing");
        ar2.add("dev ops");
        //Add all method=> to combine wi array together
//        arr1.addAll(ar2);
//        System.out.println(arr1);
      //To add a collection of list in specific place
//        arr1.addAll(2, ar2);
//        System.out.println(arr1);
//        System.out.println("===Before clear=====");
//        arr1.clear();
//        System.out.println(arr1);

        //If you want to create a copy of the previous array list the simple method is clone
        ArrayList<String> cloneList = (ArrayList<String>)arr1.clone();
        System.out.println("======After clone=======");
        System.out.println(cloneList);
    }
}
