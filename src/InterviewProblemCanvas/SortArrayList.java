package InterviewProblemCanvas;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 7, 4, 2, 9, 43, 3));
        System.out.println(sortedArrAscending(list));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 7, 4, 2, 9, 43, 3));
        System.out.println(sortedArrDesc(list2));

    }

    /**
     * 29.Write a method that can sort the ArrayList in Ascending order without using the sort method
     */

    public static ArrayList<Integer> sortedArrAscending(ArrayList<Integer> numArr) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = numArr.size();
        while (result.size() != length) {
            int min = numArr.get(0);
            for (Integer each : numArr) {
                if (each < min) {
                    min = each;
                }
            }
            result.add(min);
            numArr.remove(numArr.indexOf(min));
//            System.out.println(result);
//            System.out.println(numArr);
        }
        return result;
    }


    /**
     * Write a method that can sort the ArrayList in descending order without using the sort method
     */

    public static ArrayList<Integer> sortedArrDesc(ArrayList<Integer> numArr) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = numArr.size();

        while (result.size() != length) {
            int max = numArr.get(0);
            for (Integer each : numArr) {
                if (each > max) {
                    max = each;
                }
            }
            result.add(max);
           // numArr.remove(numArr.indexOf(max));
            numArr.remove(max);

        }
        return result;
    }

}
