package InterviewProblemCanvas;
/**

 */

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[]  arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(mergedArr(arr1, arr2)));
        System.out.println(Arrays.toString(mergeMethod2(arr1, arr2)));
        System.out.println(Arrays.toString(mergeMethod3(arr1, arr2)));
        System.out.println();
        String [] str1= {"a","b","c"};
        String [] str2 = {"a","b","c","d","e","f"};
        System.out.println(Arrays.toString(mergedArr(str1, str2)));
        System.out.println(Arrays.toString(mergeMethod2(str1, str2)));
        System.out.println(Arrays.toString(mergeMethod3(str1, str2)));
    }
    public static int []  mergedArr(int[] arr1,int[]arr2) {
        int length = arr1.length +arr2.length;
          int[] merge = new int[length];

          for(int i =0; i<arr1.length; i++) {
              merge[i] = arr1[i];
          }
          for(int i=arr1.length, k=0;i < length;i++,k++) {
              merge[i] = arr2[k];
          }

      return merge;
    }
    public static int[] mergeMethod2(int[] arr1, int [] arr2) {
        int result = arr1.length + arr2.length;
        int[] merge = new int[result];
            for(int i =0,k=0; i< result;i++) {
                if(i < arr1.length) {
                    merge[i] = arr1[i];
                }
                if(i>= arr1.length) {
                    merge[i] = arr2[k];
                    k++;
                }
            }
        return merge;
    }
    public static int[] mergeMethod3(int[] arr1, int[] arr2) {
        int result = arr1.length + arr2.length;
        int [] merge = new int[result];
        int i=0;

        for (int each : arr1 ) {
            merge[i]=each;
            i++;
        }
        for(int each : arr2) {
            merge[i]= each;
            i++;
        }

         return  merge;
    }
    public static String[] mergedArr(String[] arrString1,String[] arrString2) {
        int strLength = arrString1.length + arrString2.length;
        String[] result = new String[strLength];
        for(int i=0;i<arrString1.length;i++) {
            result[i]= arrString1[i];
        }
        for(int i = arrString1.length,k=0; i < strLength; i++,k++) {
            result[i] = arrString2[k];
        }

        return result;
    }
    public static String[] mergeMethod2(String[] arrString1, String[] arrString2) {
        int arrLength = arrString1.length + arrString2.length;
        String[] result = new String[arrLength];

        for(int i = 0, k=0; i < arrLength;i++) {
            if(i < arrString1.length) {
                result[i] = arrString1[i];
            }
            if(i >= arrString1.length) {
                result[i]= arrString2[k];
                k++;
            }
        }

        return result;
    }
    public static String[] mergeMethod3(String [] arrString1, String [] arrString2) {
        int arrLength = arrString1.length + arrString2.length;
        String [] result = new String[arrLength];
        int i =0;
        for(String each : arrString1) {
            result[i] = each;
            i++;
        }
        for (String each : arrString2) {
            result[i] = each;
            i++;
        }
        return result;
    }
}
