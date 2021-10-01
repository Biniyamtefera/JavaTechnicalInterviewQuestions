package earlyBirdQuestion;

public class FindSkipNumber {
    public static void main(String[] args) {
        /**
         * find the missing number
         */
        int [] arr = {1,2,3,4,6,7};
        missingNum(arr);
    }

    public static void missingNum(int [] arr) {
        int temp =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=temp){
                System.out.println("Missing number is = "+temp);
                break;
            }
            temp++;
        }
    }
}
