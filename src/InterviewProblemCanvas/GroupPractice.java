package InterviewProblemCanvas;
import java.util.Arrays;

/**
 Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
 Ex:   int[] arr = {10, 9, 8, 7};
 arr = Sort(arr);   ⇒  { 7, 8, 9, 10};
 */
public class GroupPractice {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7,34,6};

        System.out.println(Arrays.toString(ascendingNum(arr)));
        System.out.println(Arrays.toString( descendingNum(arr)));
    }

    public static int[] ascendingNum(int [] nums) {
            int temp = 0;
        for (int i =0;i < nums.length; i++) { //{10, 9, 8, 7};
            for (int j=0; j< nums.length;j++){ //10=9
                if(nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static int[] descendingNum(int [] nums) {
        int temp = 0;
        for (int i =0;i < nums.length; i++) { //{10, 9, 8, 7};
            for (int j=0; j< nums.length;j++){ //10=9
                if(nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
