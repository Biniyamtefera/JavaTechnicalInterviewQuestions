package JavaInterviewQuestion.arrayListIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortingInDescending {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,4,2,9));

        dscending(nums);
    }

    public static void dscending(List<Integer> nums){
        for (int i= 0 ; i < nums.size(); i++) {
            for (int j =0; j < nums.size();j++) {
                if(nums.get(i) > nums.get(j)) {
                    Integer temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j, temp);

                }
            }
        }
        System.out.println(nums);
    }
}
