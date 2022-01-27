package InterviewCodingTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {

   /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

    public static void main(String[] args) {
        char[] word = {'C', 'A', 'T'};
        permutation(word);
    }


    // put => put,ptu,upt,utp,tup,tpu
    public static void permutation(char[] word) {

        for (int i=0; i < word.length; i++) {
            String letter1 = word[i] + ""; //c, A, T
            String letter2 = word[i] + ""; //c, A,T
            for (int j=0, k= word.length-1; j< word.length;j++, k--) {
                if(word[i]!=word[j]) {
                    letter1 += word[j]; //CAT  , ACT  ,TCA
                }
                if(word[i]!=word[k]) {
                    letter2 +=word[k]; //CTA  , ATC , TAC
                }
            }
            System.out.println(letter1); //CAT  , ACT ,TCA
            System.out.println(letter2);  //CTA  , ATC , TCA

        }


    }

}
