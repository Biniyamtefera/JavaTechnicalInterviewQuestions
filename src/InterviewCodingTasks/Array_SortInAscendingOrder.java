package InterviewCodingTasks;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static void main(String[] args) {
        int [] num = {23,22,45,32,13};
        ;
        System.out.println(Arrays.toString(sortArray(num)));
    }

    public int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }
    public static int[] sortArray(int[] arr) {
        int [] newArr = new int[arr.length];
        int max = arr[0];

        for (int i=0;i<arr.length; i++) {

            for (int j =0; j < arr.length; j++) { //13,22,23,32,45
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }


}
