package StringDemo;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        /**
         * Assume you have a string "this is a test string".
         * You need to write a code to reverse the string.
         * The output should be "string test a is this".
         */
        String str = "this is a test string";
        extracted(str);
    }

    private static void extracted(String str) {
        String newStr = "";
        String [] arr= str.split(" ");
        for (int j=arr.length-1; j>=0;j--) {
              newStr +=" " +arr[j];
        }
        System.out.println(newStr.trim());
    }
}

