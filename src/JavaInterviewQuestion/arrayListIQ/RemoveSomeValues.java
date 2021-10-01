package JavaInterviewQuestion.arrayListIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        removeAbove100(list1);
        removeAbove1002(list1);
        removeAbove1003(list1);
        removeAbove1004(list1);

    }

    /**
     * Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void removeAbove100(List<Integer> nums) {
        nums.removeIf(num -> num>100);
        System.out.println(nums);

    }
    public static void removeAbove1002(List<Integer> nums){
        for(int num : nums) {
            if(num > 100) {
                nums.remove(num);
            }

        }
        System.out.println(nums);
    }
    public static void removeAbove1003(List<Integer> lists1) {
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int  each : lists1) {
            if( each < 100)
                list2.add(each);
        }
        System.out.println(list2);
    }
    public static void removeAbove1004(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if(it.next()>100) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
