package InterviewProblemCanvas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

 */
public class RemoveValue {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,145));
       nums.removeIf(s -> s > 100); //
        System.out.println(nums);

        remove(nums);
    }
    public static void remove(List<Integer> nums) {
         List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if(num < 100) {
              result.add(num);
            }
        }
        System.out.println(result);
    }
}
