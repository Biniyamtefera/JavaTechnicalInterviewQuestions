package JavaInterviewQuestion.MJclass;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {3,-7,0,0,1,0,-2,0,6,0,};
        System.out.println("moveAllZeroToTheEnd(nums) = " + Arrays.toString(moveAllZeroToTheEnd(nums)));
        System.out.println("Arrays.toString(moveAllZeroToThefirst(nums)) = " + Arrays.toString(moveAllZeroToThefirst(nums)));
        System.out.println("Arrays.toString(moveToTTheFirst2(nums)) = " + Arrays.toString(moveToTTheFirst2(nums)));

    }

    /**
     * 2. Find a pair whose sum is closest to zero in Array
     *
     * 3. Move all zeros to the end of array or to the first of array
     */

      //int[] nums = {3,-7,0,0,1,0,-2,0,6,0,}
    //move zeros to the last
    public static int[] moveAllZeroToTheEnd(int[] array) {
        int [] allZerosToEnd = new int[array.length];
           for (int i=0,j=0; i < array.length;i++) {
               if(array[i]!=0) {
                   allZerosToEnd[j++] = array[i];
               }
           }

        return allZerosToEnd;
    }
     //move zeros to the first
    public static int[] moveAllZeroToThefirst(int[] array) {
        int [] allZerosToEnd = new int[array.length];
        for (int i=0,j=0; i < array.length;i++) {
            if(array[i]!=0) {
                allZerosToEnd[array.length-j-1] = array[i];
                j++;
            }
        }

        return allZerosToEnd;
    }


    /**
     * not finished
     * @param arrays
     * @return
     */
    public static int[] moveToTTheFirst2(int[] arrays) {
        int [] allZerosToEnd = new int[arrays.length];
        //first count all zeros
        //add non zero element starting from one plus the total values of zero till the end
        int count =0;
        for(int i= 0; i<arrays.length;i++) {
            count++;
        }
        for(int i= count,j=0; i<arrays.length;i++) {
            if(arrays[j]!=0) {
                allZerosToEnd[i++] = arrays[j];
            }
        }

        return allZerosToEnd;
    }
}
