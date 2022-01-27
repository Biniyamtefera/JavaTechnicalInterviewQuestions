package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {5,6,7};

        System.out.println(concatArray(arr1, arr2));
    }
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static int[] concatArray(int [] arr1, int [] arr2) {
        int [] newArr = new int[arr1.length + arr2.length];
       for(int i=0 ; i < arr1.length; i++) {
           newArr[i] = arr1[i];
       }
       for(int j =arr1.length; j < newArr.length; j++) {
           newArr[j]= arr2[j];
       }
       return newArr;
    }
}
