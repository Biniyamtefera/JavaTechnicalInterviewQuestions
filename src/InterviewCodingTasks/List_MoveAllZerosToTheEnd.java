package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,0,4,0,5,0,7));
        System.out.println("moverZero(list) = " + moverZero(list));
        System.out.println("moveZerosToTheEnd(list) = " + moveZerosToTheEnd(list));
    }

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
       // list.removeAll(Arrays.asList(0));

        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

    public static List<Integer> moverZero(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        int k=0;
        for (int i=0; i < list.size(); i++) {
            if(list.get(i)!=0) {
                newList.add(list.get(i));
                k++;
            }
        }
        for(int i =k; i < list.size();i++) {
            newList.add(0);
        }
        return newList;
    }


}
