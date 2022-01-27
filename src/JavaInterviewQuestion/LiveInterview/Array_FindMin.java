package JavaInterviewQuestion.LiveInterview;

public class Array_FindMin {
    public static void main(String[] args) {
        int [] arr = {3,5,3,6,45,0,8,4};
        System.out.println("minNum(arr) = " + minNum(arr));
        int min1 = Integer.MAX_VALUE;
        System.out.println(min1);
    }
    public static int minNum(int [] nums)  {
        int min = nums[0];
        int min1 = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num < min) {
                min= num;
            }
        }
        return min;
    }
}
