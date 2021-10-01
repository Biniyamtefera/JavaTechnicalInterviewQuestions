package youtubeVedioIQ;

import java.util.Arrays;

public class SortArrayByParty {
    /**
     * Given an array of non- negative integers, write a code to return an array consisting
     * of all the even elements, followed by all the odd elements of an array
     */
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        int [] arr1= {10,13,44,9};
        System.out.println("sortArr(arr) = " + Arrays.toString(sortArr(arr)));
        System.out.println("sortArr(arr) = " + Arrays.toString(sortArr(arr1)));
    }
    public static int[] sortArr(int [] arr) {
         int [] newArr = new int[arr.length];
         int j=0;
         int k =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                newArr[j++]=arr[i];
            } else {
                newArr[arr.length-1-k]=arr[i];
                k++;
            }
        }
        return newArr;
    }
}
