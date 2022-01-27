package InterviewCodingTasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the min number from an int Array
     */

    public static void main(String[] args) {
        int[] num = {3,5,4,7,8,2,9};
        System.out.println(minNum(num));
    }

    public int maxValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }

    public static int minNum(int [] arr) {
        int min = Integer.MAX_VALUE;

        for (int each : arr )
        {
            if(each < min) {
                min = each;
            }
        }
        return min;
    }




}