package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,6,33,453));

        System.out.println("removeAboveHundred(list) = " + removeAboveHundred(list));
        System.out.println("removeAboveHundred2(list) = " + removeAboveHundred(list));
        System.out.println("removeAboveHundred3(list) = " + removeAboveHundred(list));
    }
    // solution 1
    public List<Integer> remove1(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }

        return list;
    }



    // solution 2
    public List<Integer> remove2(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }

    public static List<Integer> removeAboveHundred(List<Integer> list) {
      list.removeIf(n->n>100);
      return list;

    }
    public static List<Integer> removeAboveHundred2(List<Integer> list) {
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            if(it.next()>100) {
                it.remove();
            }
        }
        return list;
        }
        public static List<Integer> removeAboveHundred3(List<Integer> list) {
        for(int each : list) {
            if(each > 100) {
                list.remove(each);
            }
        }
        return list;
        }
}
