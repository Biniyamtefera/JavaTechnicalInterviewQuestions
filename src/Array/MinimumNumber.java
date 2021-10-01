package Array;
/**
Write a method that can find the minimum number from an int Array
 */
public class MinimumNumber {
    public static void main(String[] args) {
        System.out.println("minNUm(new int[]{2, 3, 45}) = " + minNUm(new int[]{2, 3, 45}));
    }



  /**
    The parameter and the return time is integer
   */
    public static int minNUm(int[] num) {
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        return min;
    }

    /**
    The return type and parameter is double
     */
    public static double minNUm(double[] num) {
        double min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        return min;
    }

}
