package InterviewQuestions.String;
/*
Write a method that can find the maximum number from an int Array
 */
public class MAxNum {
    public static void main(String[] args) {
        int [] nums = {2,45,33,22,300,2774};
        int max = nums[0];

        for (int i =0; i < nums.length ; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

}
