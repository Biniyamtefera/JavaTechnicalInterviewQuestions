package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static void main(String[] args) {
        int[] arr = {3,4,3,5,6,4,5,7};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }




    // solution 1
    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
    // repeat for my self
    public static int [] remDup(int [] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static int [] remDup2(int [] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }

    //soulution3
    public static void removeDuplicate3(int [] arr) {

        //Is a way t convert array => set
        for (int i=0; i<arr.length;i++) {

        }
    }





}
