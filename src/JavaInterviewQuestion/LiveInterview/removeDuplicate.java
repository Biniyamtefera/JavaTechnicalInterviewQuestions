package JavaInterviewQuestion.LiveInterview;

import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
           String str = "abadccdfa";
        System.out.println(removeDuplicate(str));
        System.out.println(removeDuplicate2(str));
    }

    /**
     * Write a method that will remove all dupplicates from string
     * removeDup("abcc"); -> "abc"
     */
    public static String removeDuplicate(String str) {

        String [] arr = str.split("");
        List<String> list =new ArrayList<>(Arrays.asList(arr));
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set.toString().replaceAll(",", "").replace("[", "").replace("]", "").replaceAll(" ", "");
    }

    public static String removeDuplicate2(String str) {
          String s ="";
        for (int i = 0; i < str.length(); i++) {
            String strChar = str.charAt(i) +"";
            if(!s.contains(strChar)){
                s +=strChar;
            }
        }
        return s;

    }

}
