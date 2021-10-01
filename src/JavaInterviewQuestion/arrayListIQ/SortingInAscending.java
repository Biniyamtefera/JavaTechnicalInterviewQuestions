package JavaInterviewQuestion.arrayListIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortingInAscending {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,4,2,9));

                   ascending(nums);
    }

    /**
     * Write a method that can sort the ArrayList in Ascending order without using the sort method
     */
    public static void ascending(List<Integer> nums){
        for (int i= 0 ; i < nums.size(); i++) {
            for (int j =0; j < nums.size();j++) {
                if(nums.get(i) < nums.get(j)) {
                    Integer temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j, temp);

                }
            }
        }
        System.out.println(nums);
    }
}
