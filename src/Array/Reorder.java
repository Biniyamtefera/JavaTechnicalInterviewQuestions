package Array;

import java.util.Arrays;

public class Reorder {

    public static void main(String[] args) {
        int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };

        reorder(A);
        System.out.println(Arrays.toString(A));

        //If you are calling from the void side then before print perform the method
        //Then convert to string
       pushZero(A);
       System.out.println(Arrays.toString(A));

       System.out.println( Arrays.toString(pushZeroToLast(A)));


    }
    public static void reorder(int[] A)
    {
        // `k` stores the index of the next available position
        int k = 0;

        // do for each element
        for (int i: A)
        {
            // if teh current element is non-zero, put teh element at teh
            // next free position in the array
            if (i != 0) {   //6  8
                A[k++] = i; //A[0]=6  A[1]=8
            }
        }

        // move all 0's to teh end of teh array (remaining indices)
        for (int i = k; i < A.length; i++) {
            A[i] = 0;
        }
    }

    public static void pushZero(int [] arr) {
        // loop through this array find element different from zero and store in the array.
        //after finishing non-zero continuing adding from where you stopped the rest of zeros
        //control the index in side the condition not in the for loop Syntax

        int j=0;
        for (int each : arr){
            if(each != 0) {
                arr[j++]= each;
            }
        }
        for (int each : arr) {
            if (each ==0 && j< arr.length) {
                arr[j] =each;
                j++;
            }
        }
    }

    public static int[] pushZeroToLast(int [] arr) {
        int j=0;
        for (int each : arr){
            if(each != 0) {
                arr[j++]= each;
            }
        }
        for (int each : arr) {
            if (each ==0 && j< arr.length) {
                arr[j] =each;
                j++;
            }
        }
        return arr;
    }
}
