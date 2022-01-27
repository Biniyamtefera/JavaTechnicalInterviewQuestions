package InterviewCodingTasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] num = {3,5,4,7,8,2,9};
        System.out.println(maxNum(num));

    }

    public int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static int maxNum(int [] arr) {

        int max = arr[0];

        for (int i=0;i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
