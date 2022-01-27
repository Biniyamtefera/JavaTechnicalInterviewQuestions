package InterviewCodingTasks;

import java.util.*;

public class List_RemoveNameAhmed {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeName(name));
        System.out.println(removeName2(name));
    }

    // solution 1
    public List<String> remove1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }


    // solution 2
    public List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }


    // solution 3
    public List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }
    //mysolution1
    public static List<String> removeName(List<String> name) {
        name.removeAll(Arrays.asList("Ahmed"));
        return name;
    }
    //mysolution2

    public static List<String> removeName2(List<String> name) {
        name.removeIf(each -> each.equals("Ahmed"));
     return name;
    }
// mysolution 3
public static List<String> removeName3(List<String> name) {
    for(String each : name) {
        if(each.equals("Ahmed")) {
            name.remove(each);
        }
    }
    return name;
}

    public static List<String> removeName4(List<String> name) {
        Iterator<String> it = name.listIterator();
        while (it.hasNext()) {
            if(it.equals("Ahmed")){
                it.remove();
            }
        }
        return name;
    }





}
