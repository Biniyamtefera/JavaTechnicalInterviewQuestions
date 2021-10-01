package earlyBirdQuestion;

import java.util.Arrays;

public class ReturnIndices {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println("returnIndices(arr, 9).toString() = " + Arrays.toString(returnIndices(arr, 9)) );
        findTarget(arr, 9);
    }
    public static int[] returnIndices(int [] nums, int target) {

        int [] arr = new int[2];

        for (int i = 0; i <nums.length ; i++) {
            if(i == nums.length-1) {
                return arr;
            }

            if(nums[i] + nums[i+1]== target) {
                arr[0] = i;
                arr[1] = i+1;
                break;
            }

        }
        return arr;
    }
    public static int [] findTarget(int arr[], int target) {
        int index =0;
        int j=1;
        int [] arrTar = new int[2];
        for (int i = j; i < arr.length; i++) {
            int sum = 0;
            sum = arr[index] + arr[i];
            if(sum ==target) {
                System.out.println(index);
                System.out.println(i);
                arrTar[0] = index;
                arrTar[1] = i;

                break;
            }
            if(i== arr.length-1){
                j++;
                index++;
                i=--j;
            }

        }
        return arrTar;

    }
}
