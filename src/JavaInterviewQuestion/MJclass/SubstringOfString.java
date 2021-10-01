package JavaInterviewQuestion.MJclass;

public class SubstringOfString {

    public static void main(String[] args) {
        String word =  "ABCD";

        printAllSubstring(word);
    }

    /**
     * 1. Find all substring of String in Java
     */

         //ABC/AB/AB/BC/C/A/B
       //(0,0)==>(0,1)==>A  ==>AB  ==>ABC
        //(1,1)==>

    public static void printAllSubstring(String str) {
          String sub = "";
        for(int i=0; i < str.length();i++) {  //3
            for(int j=i+1; j<=str.length();j++) {
                sub = str.substring(i,j);
                System.out.println(sub);
            }
        }
    }
}
