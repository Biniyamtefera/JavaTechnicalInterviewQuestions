package fromB22Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintCOntaingSpecificLetter {
    public static void main(String[] args) {
        /**
         * /*
         *     String [] strArr = "aabc", "abcdb", "gggh", "klsrtabcabc",
         *          "78787*79789", "aaffdfddddddddddddd";
         *          print all string which contains [a,b,b,c];
         *          output = "abcdb", "klsrtabcabc"
         *      */

        String [] strArr = {"aabc", "abcdb", "gggh", "klsrtabcabc",
                "78787*79789", "aaffdfddddddddddddd"};

        String outPut = "";

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
                if((str.contains("a")&& str.contains("b"))&& str.contains("c")) {
                    outPut +="," + str;
            }
        }
        System.out.println(outPut);

    }


    public static String abbc(String [] str){
        return Arrays.stream(str).filter(p->p.contains("a") && p.contains("b")&& p.contains("c")&&
                Collections.frequency(Arrays.stream(p.split("")).collect(Collectors.toList()),"b") > 1)
                .collect(Collectors.joining(" "));
    }
}
