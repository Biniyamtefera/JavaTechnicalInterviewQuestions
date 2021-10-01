package JavaInterviewQuestion.MJclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T9 {
    /**
     3. how to convert 3 digits number from phone dial pad to all combinations of represented characters:
     1 null         2 abc   3 def
     4 ghi         5 jkl     6 mno
     7 pqrs       8 tuv   9 wxyz

     Using the above keypad, for example, we see that:
     223 maps to the words 'ace' and 'bad', ...

     628 maps to 'mat' and 'nav' , ...
     */

    public static void main(String[] args) {
        String number ="632";
        System.out.println("t9_A(number) result = " + t9_A1(number));
        System.out.println("t9_A(number) = " + t9_A(number));

    }

    public static List<String> t9_A1(String num) {
       // Storing the number inside
        ArrayList<String> list6 = new ArrayList<>(Arrays.asList("M","N","O"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("D","E","F"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","B","C"));

        List<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i <list6.size() ; i++) {
            for (int j = 0; j < list3.size(); j++) {
                for (int k = 0; k < list2.size(); k++) {
                    temp = list6.get(i) + list3.get(j) + list2.get(k);
                    result.add(temp);
                }

            }
        }
        return result;

    }

    public static List<String> t9_A (String num){ // 753 ==> index 5 , index 3, index 1

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("D", "E", "F"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("G", "H", "I"));
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("J", "K", "L"));
        ArrayList<String> list6 = new ArrayList<>(Arrays.asList("M", "N", "O"));
        ArrayList<String> list7 = new ArrayList<>(Arrays.asList("P", "Q", "R", "S"));
        ArrayList<String> list8 = new ArrayList<>(Arrays.asList("T", "U", "V"));
        ArrayList<String> list9 = new ArrayList<>(Arrays.asList("W", "X", "Y", "Z"));

        List<List<String>> numbers =
                new ArrayList<>(Arrays.asList(list2, list3, list4, list5, list6, list7, list8, list9));

        numbers.get(3).get(2);

        List<String> result = new ArrayList<>();
        String temp ="";
        // input is 753
        for (int i = 0; i < numbers.get(convertCharToInt(num.charAt(0))-2).size(); i++) {

            for (int j = 0; j <numbers.get(convertCharToInt(num.charAt(1))-2).size(); j++) {

                for (int k = 0; k <numbers.get(convertCharToInt(num.charAt(2))-2).size(); k++) {


                    temp = numbers.get(convertCharToInt(num.charAt(0))-2).get(i)
                            +numbers.get(convertCharToInt(num.charAt(1))-2).get(j)
                            +numbers.get(convertCharToInt(num.charAt(2))-2).get(k);
                    result.add(temp);
                }
            }
        }


        System.out.println("result.size() = " + result.size());
        return result;
    }

    public static int convertCharToInt (char c){ // '2' ==> 2
        //Integer num = Integer.valueOf(""+c);
        return Character.getNumericValue(c);
    }


}
