package JavaInterviewQuestion.MJclass;

import java.util.*;

public class BalancedParentheses {
    /**
     * 1. balanced the paretheses ( first way use the loop, second way use the Collection)
     * --------------------------------------------------
     */
    public static void main(String[] args) {
        String str = "({[]})]";
        System.out.println("isBalanced(str) = " + isBalanced(str));
    }
    // stack = 0
    // stack.pop = [ ;

    //  {{()}()  ==> T
    // [{()}]

    // 1. first ==> the number of opening and the number closing should match
    // 2. second ==> you should close the inner Parentheses first and go to outer

    // ][{()}][

    // list opening = [   [ , { . ( ,[     ]
    // list closing = [   ], ) , } , ]     ]

    public static boolean isBalanced2(String str) {

        List<Character> opening = new ArrayList<>();
        List<Character> closing = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                opening.add(str.charAt(i));
            } else if ((str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') )  {
                closing.add(str.charAt(i));
            }
        }

        if (opening.size() != closing.size()){
            return false;
        }

        int lastIndex = opening.size() -1;

        for (int i = 0; i < opening.size(); i++) {
            switch (str.charAt(i)) {

                case '{':
                    if (closing.get(lastIndex -i) != '}') {
                        return false;
                    }
                case '[':
                    if (closing.get(lastIndex -i) != ']') {
                        return false;
                    }
                case '(':
                    if (closing.get(lastIndex -i) != ')') {
                        return false;
                    }
            }
        }

        return true;
    }

    // LIFO , last in first out
    // push() ==> add to the last
    // pop() ==> one of them will return the value of last index
    //       ==> it will remove it at same time
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        try {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                    stack.push(str.charAt(i)); // [ '{', '(', '[' ]
                } else {
                    switch (str.charAt(i)) {
                        case '}':
                            if (stack.pop() != '{') {
                                return false;
                            }
                            break;
                        case ']':
                            if (stack.pop() != '[') {
                                return false;
                            }
                            break;
                        case ')':
                            if (stack.pop() != '(') {
                                return false;
                            }
                            break;
                    }
                }
            }
        }catch (EmptyStackException e){
            return false;
        }


        if (stack.size() != 0) {
            return false;
        }

        return true;
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
