package InterviewCodingTasks;

import java.util.Arrays;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */
    public static void main(String[] args) {
        String[] str = {"A","B", "c"};
        System.out.println(Arrays. toString(reverse2(str)));
    }

    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }
    public static String[] reverse2(String[] str) {
        String[] newStr = new String[str.length];
        for(int i=str.length-1, k=0; i >=0; i--,k++) {
            newStr[k] = str[i];
        }
        return newStr;
    }




}
