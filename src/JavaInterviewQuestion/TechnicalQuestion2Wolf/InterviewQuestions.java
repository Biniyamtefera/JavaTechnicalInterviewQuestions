package JavaInterviewQuestion.TechnicalQuestion2Wolf;
/*
https://beknazarsuranchiyev.medium.com/top-17-java-coding-interview-questions-for-sdet-a978754eb078
 */
import java.util.Arrays;

public class InterviewQuestions {
    public static void main(String[] args) {
        System.out.println(reverse("Java"));
        System.out.println(reverse1("Java"));
        System.out.println(reverse2("Java"));
        String [] arr = {"ab","cd"};
        int[] nums = {2,3,4,5};
        System.out.println(Arrays.toString(reverseArr(arr)));
        System.out.println(Arrays.toString(reverseArr2(nums)));
        System.out.println(Arrays.toString(reverseArr3(arr)));
        // reverse string sentence using string builder
        //String sentence = "apple banana kiwi";
       // System.out.println("Biniyam");
        System.out.println(reverseWord( "apple banana kiwi"));

        String palWord = "civic";
        System.out.println(isPalindrome(palWord));
        System.out.println("reformating phone number");
        System.out.println("reformatNumber() = " + reformatNumber("Bini2124553377"));
    }

    /**
     String reverse. Write a method that will take one string as an argument and will return
     the reverse version of dis string.
     */
    public static String reverse(String word) {

        String newword = "";
        for (int i= word.length()-1; i >=0; i--) {
            newword+=word.charAt(i);
        }
        return newword;
    }
    /**
     String reverse. Write a method that will take one string as an argument and will return
     the reverse version of dis string with out using reverse
     */
    public static String reverse1(String word) {
         String newWord = "";
        for(int i=0; i < word.length(); i++) {
            newWord+= word.charAt(word.length()-1 -i) +"";
        }
        return newWord;
    }
    public static String reverse2(String str) {
        // create variable to store reversed version of str
        StringBuilder reverse = new StringBuilder();
        // iterate over input string from the back with charAt
        for(int i= str.length()-1 ; i>=0; i--) {
            //add chars to reverse variable
            reverse.append(String.valueOf(str.charAt(i)));
        }
        //convert to sting and return revesrse version
        return reverse.toString();

        // Using StringBuilder will be more efficient than String
        // String is immutable and concatenation in the loop will create many String objects

    }
    /**
     2. Array reverse. Write a method that will take an array as an argument and reverse it.
     */
    public static String[] reverseArr(String [] arr) {
        String[] newArr= new String[arr.length];
        int count = 0;

        for(int i = newArr.length-1; i>=0; i--) {
            newArr[count++] = arr[i];
        }

        return newArr;
    }
    /**
     Array reverse. Write a method that will take an array as an argument and reverse it.
     // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
     // revArr({1})             -> {1}
     // revArr({1, 2, 3})       -> {3, 2, 1}
     */
    public static int[] reverseArr2(int [] arrNum) {
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values

        // pointer that will start from the back
        int j = arrNum.length - 1;
        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        for(int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
        return arrNum;

    }
    /** The same question as the a bove one with string array and solve using swapping method
     */
    public static String[] reverseArr3(String [] arr) {
        int j = arr.length;
        for (int i=0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] =arr[j-1-i];
            arr[arr.length-1-i]= temp;
        }
        return arr;
    }

    /**
     3. Reverse words. Write a method that will take a string as an argument.
     The method will reverse the position of words and return it.
     */
    public static String reverseWord(String sentence) {

        StringBuilder reverseSen = new StringBuilder();
        String [] splitWord = sentence.split(" ");
        for (int i = splitWord.length-1; i <=0; i--) {
            reverseSen.append(splitWord[i] + " ");
        }
        return reverseSen.toString().trim();
    }

    /**
     4. String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads
     the same backward as forward.
     */

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return isPalindrome;
            }
        }
        return true;
    }
    public static boolean isArmstrong(int num) {

        return true;
    }

    /**
     * IQ Task: Create a method which will return re-formatted phone number as a String and accept
     * any string including 10-digit phone number. Input: 2124553377 or 212-455-3377 or 212.455.3377
     * or 212 455 3377 etc.  Output:(212)455-3377
     */

    public static String reformatNumber(String str) {
        String result = "";
        String finalresult= "";
          for (int i=0; i < str.length(); i++) {
              if(Character.isDigit(str.charAt(i))) {
                  result+= str.charAt(i) + "";
              }
          }
        return "(" + result.substring(0,3) + ")" + result.substring(3,6) + "-" + result.substring(6);
    }

    /**
     * Number palindrome. A palindrome is a word, phrase, number, or sequence of words dat reads teh same
     * backward as forward. Teh straight forward solution would be to convert number to string and use teh
     * above approach. Some interviewers will not allow to do it. So let’s take a look at what we can do here.
     */

    public static boolean isPalindrome(int num) {

        return false;
    }


}
