package JavaInterviewQuestion.MJclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByFrequency {

    /**
    2. How to sort an String by frequency and keep order :
 input (tomorrow) => outPut (ooorrtmw)
input (zadbsbbaad) => outPut (aaabbbddzd)
--------------------------------------------------
     */
    //tomorrow ==ooorrtmw
    public static void main(String[] args) {
        String str = "tomorrow";

        System.out.println("sortByFrequency(str) = " + sortByFrequency(str));
    }

    public static String sortByFrequency(String str) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) + "");
        }
        //[t,o,m,o,r,r,o,w]

        //[t,o,m,o,r,r,o,w]
        // to swap , 1.  temp = index i
        //  index i = index i +1
        // 3. index i+1 = temp



        //
        //
        //
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(Collections.frequency(list,list.get(i)) < Collections.frequency(list, list.get(j))) {
                    // first step
                    String temp = list.get(i);
                    //second step
                    list.set(i, list.get(j)); // change the value of index i with the new value of index j
                    //third step
                    list.set(j, temp);
                }
            }

        }

        String result = "";
         result = String.join("",list);

         return result;

    }
}
