package JavaInterviewQuestion.MJclass;


import java.util.*;

public class SecondMaximumNumber {
    public static void main(String[] args) {
        int [] array1 = {45,12,85,32,89,39,69,44,42,1,6,8};
//        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        };

        System.out.println("secondMax(array1) = " + secondMax(array1));
    }
    public static int secondMax(int[] num) {
        int secondMax=0;
        //Array.sort(num); first way to sort
        //Collections.sort(list<Integer>
        //Assume all the numbers are unique
        Arrays.sort(num);

        for (int i =0; i < num.length; i++) {
            secondMax = num[i-2];
        }
        return secondMax;
    }

    /**
     * sort array using nested for loop
     * @param
     * @return
     */
    public static void SecondMax(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static int[]  sortWithoutMethods(int[] num) {
        //2,3,0,-1,5,9,6
        //{2,3,0,-1,9,6}

        for(int i=0 ; i < num.length; i++) {
            for(int j=0; j < num.length; j++) { // if this condition is tue==> Swap the value of with the value of j
                // how we can swap two numbers:
                     if(num[i] < num[j]) {
                         int temp = num[i];
                         num[i]= num[j];
                         num[j]= temp;
                     }
                /**
                 * int temp num[i]
                 * num[i] = num[j]==> you will lose the vale of num[i]
                 */
                /**
                 * a=5 and b-7
                 * a= a+b; a= 12
                 * b= a-b; b=5
                 * a= a-b; a=7
                 */

            }
        }
        return num;
    }


   /**
   return the unique number by removing the duplicated.
    */
    public static int[] removeDuplicate(int[] num) {
       num = Arrays.stream(num).distinct().toArray();
       return num;
    }

    public static Set<Integer> removeDuplicate2(int[] nums) {
       //[3,5,9,0,-7,2,6,5]

        Set<Integer> set = new HashSet<>();

        for (int each : nums) {
            set.add(each);
        }

        return set;

    }




}
