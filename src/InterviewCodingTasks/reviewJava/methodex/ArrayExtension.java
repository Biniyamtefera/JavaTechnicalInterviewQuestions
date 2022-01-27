package InterviewCodingTasks.reviewJava.methodex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Program starts and asks user to enter length of an array
 * Program generates arrays of random integer numbers with array length specified by the user
 * program creates the second array with size of twice as much as the first arrays.
 * The first element in the new arrays are the first sam element as in old  array. The
 * other half of element are element as in the first array multiplied by two
 *
 */
public class ArrayExtension {
    public static final int MULTIPLIER = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();

    }

    /**
     * The method extends array.
     * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
     * is returned from this method.
     *
     * @param arr - base of extension. Extended array contains elements from this array
     * and additionally contains the same elements multiplied by two.
     * @return extended array.
     */
    public static int[] extendArray(int[] arr) {
        int newArrayLenght = arr.length * 2;
        int[] resultArray = Arrays.copyOf(arr, newArrayLenght);

        for (int i = arr.length; i < newArrayLenght; i++) {
            resultArray[i] = arr[i - arr.length] * MULTIPLIER;
        }

        return resultArray;
    }

    public static int[] generateRandomArray(int amountOfElements) {
        Random r = new Random();
        int[] resultArray = new int[amountOfElements];
        for (int i = 0; i < amountOfElements; i++) {
            resultArray[i] = r.nextInt(100) + 1;
        }
        return resultArray;
    }
}
