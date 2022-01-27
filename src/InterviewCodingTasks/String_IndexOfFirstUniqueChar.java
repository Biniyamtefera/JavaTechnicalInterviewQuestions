package InterviewCodingTasks;

public class String_IndexOfFirstUniqueChar {

    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */
    public static void main(String[] args) {
        System.out.println("indexOfFirstNonRepeatingChar2(\"BBiniyam\") = " + indexOfFirstNonRepeatingChar2("BBiniyam"));
    }
    public static int indexOfFirstNonRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (char each : s.toCharArray()) {
                if (each == s.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfFirstNonRepeatingChar2(String str) {
        int count =0;
        for(int i =0; i < str.length(); i++) {
            count=0;
            for(int j=0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count ++;
                }
            }
            if(count==1) {
                return  str.indexOf(str.charAt(i));
            }
        }
        return -1;
    }


}
