package InterviewCodingTasks.reviewJava.HardIntQ;

import java.util.Arrays;
//https://www.interviewcake.com/question/java/merge-sorted-arrays?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23384:%20Merge%20Sorted%20Arrays&utm_medium=email&utm_medium=email
public class LargeCokiesSale {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        System.out.println(Arrays.toString(mergeSortedArrays(myArray, alicesArray)));
// prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
    }
    public static int[] mergeSortedArrays(int[] myArray, int[] alicesArray) {
        int[] mergedArray = Arrays.copyOf(myArray, myArray.length + alicesArray.length);
        System.arraycopy(alicesArray, 0, mergedArray, myArray.length, alicesArray.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }
    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // make an array big enough to fit the elements from both arrays
        int[] mergedArray = new int[myArray.length + alicesArray.length];

        int headOfMyArray = myArray[0];
        int headOfAlicesArray = alicesArray[0];

        // case: 0th comes from my array
        if (headOfMyArray < headOfAlicesArray) {
            mergedArray[0] = headOfMyArray;

            // case: 0th comes from Alice's array
        } else {
            mergedArray[0] = headOfAlicesArray;
        }

        // eventually we'll want to return the merged array
        return mergedArray;
    }

    public static int[] mergeArrays1(int[] myArray, int[] alicesArray) {

        int[] mergedArray = new int[myArray.length + alicesArray.length];

        int currentIndexAlices = 0;
        int currentIndexMine   = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {
            int firstUnmergedAlices = alicesArray[currentIndexAlices];
            int firstUnmergedMine = myArray[currentIndexMine];

            // case: next comes from my array
            if (firstUnmergedMine < firstUnmergedAlices) {
                mergedArray[currentIndexMerged] = firstUnmergedMine;
                currentIndexMine++;

                // case: next comes from Alice's array
            } else {
                mergedArray[currentIndexMerged] = firstUnmergedAlices;
                currentIndexAlices++;
            }

            currentIndexMerged++;
        }

        return mergedArray;
    }

    public static int[] mergeArrays2(int[] myArray, int[] alicesArray) {

        int[] mergedArray = new int[myArray.length + alicesArray.length];

        int currentIndexAlices = 0;
        int currentIndexMine   = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {

            // case: my array is exhausted
            if (currentIndexMine >= myArray.length) {
                mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
                currentIndexAlices++;

                // case: Alice's array is exhausted
            } else if (currentIndexAlices >= alicesArray.length) {
                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;

                // case: my item is next
            } else if (myArray[currentIndexMine] < alicesArray[currentIndexAlices]) {
                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;

                // case: Alice's item is next
            } else {
                mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
                currentIndexAlices++;
            }

            currentIndexMerged++;
        }

        return mergedArray;
    }

    public static int[] mergeArrays3(int[] myArray, int[] alicesArray) {

        // set up our mergedArray
        int[] mergedArray = new int[myArray.length + alicesArray.length];

        int currentIndexAlices = 0;
        int currentIndexMine   = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {

            boolean isMyArrayExhausted = currentIndexMine >= myArray.length;
            boolean isAlicesArrayExhausted = currentIndexAlices >= alicesArray.length;

            // case: next comes from my array
            // my array must not be exhausted, and EITHER:
            // 1) Alice's array IS exhausted, or
            // 2) the current element in my array is less
            //    than the current element in Alice's array
            if (!isMyArrayExhausted && (isAlicesArrayExhausted
                    || (myArray[currentIndexMine] < alicesArray[currentIndexAlices]))) {

                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;

                // case: next comes from Alice's array
            } else {
                mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
                currentIndexAlices++;
            }

            currentIndexMerged++;
        }

        return mergedArray;
    }

}
