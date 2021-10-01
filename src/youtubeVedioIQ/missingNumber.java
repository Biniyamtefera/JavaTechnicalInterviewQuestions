package youtubeVedioIQ;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};

        System.out.println("missingNumber(arr, 5) = " + missingNumber(arr));

    }
    public static int missingNumber(int [] arr) {

        int totalCount = arr.length + 1;
        int expectedSum = totalCount *((totalCount +1))/2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum-actualSum;
    }
}
