package JavaInterviewQuestion.LiveInterview;

import java.util.Arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {

      int [] arr = {3,5,3,6,45,8,4};
      maximumNum(arr);
    }
    public static void maximumNum(int[]num) {
        //Let us consider here the maximum nummmmber is the mini value of integer
        int max2 = Integer.MIN_VALUE;
        int max = num[0];
        for (int i = 0; i <num.length ; i++) {
            if(max < num[i]) {
                max=num[i];
            }
        }
        System.out.println("The max num is =" +  max );
    }

}
