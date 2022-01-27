package InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemovePalindromeStrings {

   /*
        remove palindrome strings from a List of String
    */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("love","naan","cake","cldlc","Biniyam"));
        System.out.println("removePalindromes(list) = " + removePalindromes(list));
    }

    //solution 1:
    public List<String> removePalindromes1(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        return list;
    }



    //solution 2:
    public List<String> removePalindromes2(List<String> list) {
        list.removeIf(p -> isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed.equalsIgnoreCase(str);
    }
    //the same reading from front and backward
    public static List<String> removePalindromes(List<String>list) {
        //Assume all the characters are in small letter.
        boolean isPalindrome = true;
        List<String> newList = new ArrayList<>();
       for(int i=0; i < list.size();i++) {
           String each = list.get(i).toLowerCase();
           for(int j=0, k= each.length()-1; j < each.length()/2; j++,k--){
               if(each.charAt(j)!=each.charAt(k)) {
                   isPalindrome = false;
                   newList.add(each);
                   break;
               }
           }
       }
       return newList;

    }



}
