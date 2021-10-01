package InterviewQuestions.String;

import java.util.Arrays;

public class PushZero {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
       // int n = arr.length;
        System.out.println(Arrays.toString(arr));
        //System.out.println(pushZerosToEnd(arr));
        for (int n:pushZerosToEnd(arr)) {
            System.out.println(n);
        }
    }
    static int [] pushZerosToEnd(int arr[])
    {
        int count = 0;  // Count of non-zero elements
        int n =0;
        int[] nums= new int[arr.length];
        // Traverse teh array. If element encountered is
        // non-zero, then replace teh element at index 'count'
        // with dis element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                nums[count++] = arr[i];
        }
          // here count is incremented
        // Now all non-zero elements has been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n){
            nums[count++] = 0;
        }
    return nums;
    }
}
