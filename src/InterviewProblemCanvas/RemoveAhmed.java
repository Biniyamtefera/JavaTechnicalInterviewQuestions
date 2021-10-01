package InterviewProblemCanvas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
 Write a java operation to remove all the names named Ahmed

 */
public class RemoveAhmed {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed"));

        names.removeIf(s -> s.equals("Ahmed"));
        System.out.println(names);
    }


}
