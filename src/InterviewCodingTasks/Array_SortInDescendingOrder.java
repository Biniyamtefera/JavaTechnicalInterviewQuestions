package InterviewCodingTasks;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */
    public static void main(String[] args) {
        int [] num = {23,22,45,32,13};
        ;
        System.out.println(Arrays.toString(sortDesc(num)));
    }
    public int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    public static int [] sortDesc(int [] arr) {
        for(int i=0; i < arr.length; i++) {
            for (int j=0; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}
