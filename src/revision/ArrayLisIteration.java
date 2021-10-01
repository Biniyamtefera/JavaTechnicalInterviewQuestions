package revision;

import java.util.ArrayList;

public class ArrayLisIteration {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Biniyam");
        studentList.add("Mekdes");
        studentList.add("me");
        studentList.add("Hello");

        System.out.println(studentList);
      //Using for loop
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
   //using enhanced for loop
        for (String s:studentList) {
            System.out.println(s);
        }
        // using lmda
        System.out.println("====Lamda======");
        studentList.stream().forEach(str-> System.out.println(str));
    }
}
