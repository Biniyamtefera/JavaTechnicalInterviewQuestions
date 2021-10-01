package JavaInterviewQuestion.arrayListIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Biniyam","Redu","Mimi"));
       removeName(names);
        removeName2(names);
        removeName4(names);
        removeName3(names);

    }
    /**
     * Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
     * Write a java operation to remove all the names named Ahmed
     */

    public static void removeName(List<String>  names) {
         List<String> newNames = new ArrayList<>();
        for (String name : names) {
            if(!name.equals("Ahmed")){
                newNames.add(name);
            }
        }
        System.out.println(newNames);
    }
    public static void removeName2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);
    }
    public static void removeName4(List<String>  names) {
        names.removeIf(name -> name.equals("Ahmed"));
        System.out.println(names);
    }
    public static void removeName3(List<String>  names) {

        for (String name : names) {
            if(name.equals("Ahmed")){
                names.remove(name);
            }
        }
        System.out.println(names);
    }


}
