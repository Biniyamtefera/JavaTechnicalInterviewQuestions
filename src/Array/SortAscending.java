package Array;

import java.util.Arrays;

/**
 * 12.Write a return method that can sort an int array in Ascending order without using the sort
 * method of the Arrays class
 * Ex:   int[] arr = {10, 9, 8, 7};
 *          arr = Sort(arr);   ⇒  { 7, 8, 9, 10};

 */
public class SortAscending {
    public static void main(String[] args) {
        int[] a = sortArrAsscending(new int[]{6, 4, 10, 9, 4, 2});
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        int[] b = sortArrDescending(new int[]{6, 4, 10, 9, 8, 7});
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

    }

    public static int[] sortArrAsscending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int tem = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tem = array[i];

                    array[i] = array[j];
                    array[j] = tem;

                }
            }

        }
        return array;
    }


    public static int[] sortArrDescending( int[] array) {

        for (int i=0; i< array.length;i++) {
            int tem =0;
            for(int j=i+1; j< array.length;j++ ) {
                if(array[i] < array[j]) {
                    tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;

                }
            }

        }
        return array;
    }
}
