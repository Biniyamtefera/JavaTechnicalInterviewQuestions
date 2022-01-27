package InterviewCodingTasks.reviewJava.methodex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program starts and ask the user to inpute number separated by space
 * program creat arrays of object with entered number
 * program call specific method takes int[] as an parameter and return max value in this array
 */
public class FindMaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");
        String numbers = sc.nextLine();
        System.out.println(numbers);
        String [] arr = numbers.split(" " );
        System.out.println(Arrays.toString(arr));
        int [] intArray = convertStringArrayToIntArray(arr);
        int maxInt = findMaxIntInArray(intArray);

        System.out.println("***Initial Array**");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*******maximum inti******");
        System.out.println(maxInt);

    }
    public static int findMaxIntInArray(int[] intArray){
        int max = intArray[0];
        for (int i=0; i < intArray.length; i++)        {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    private static int[] convertStringArrayToIntArray(String[] stringArray){
        int[]  intArray = new int[stringArray.length];
        for(int i=0; i < stringArray.length; i++) {
            intArray[i] = Integer.valueOf(stringArray[i]);
        }
        return intArray;
    }
}
