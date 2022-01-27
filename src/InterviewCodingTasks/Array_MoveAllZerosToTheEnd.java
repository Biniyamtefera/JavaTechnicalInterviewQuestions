package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int [] arr = {1,2,4,0,5,0,6};
        System.out.println(Arrays.toString(moveZeroToEnd1(arr)));
    }

    public int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }

    public static int[] moveZeroToEnd1(int [] array) {

        int[] newArr= new int[array.length];
        int j=0;
           for (int i=0; i < array.length; i++) {
               if(array[i]!=0) {
                   newArr[j++] = array[i];
               }
           }
           for(int i =j; i < array.length; i++) {
               newArr[i]=0;
           }


        return newArr;
    }



}
