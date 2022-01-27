package JavaInterviewQuestion.LiveInterview;

public class UniqueLetter {
    public static void main(String[] args) {
        /**
         * Write a method that will print only unique letters of given string
         * printUnique("aabbc") -> "c" printUnique("aabc") -> "bc"
         */
          String str = "aabc";
        System.out.println(uniqueLetter(str));
    }

    public static String uniqueLetter(String str) {
      //iterate trough all character
        //check the count if > 1 then don't take it if only one add the unique variable
        String uniqueLetter = "";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            String s = str.charAt(i) + "";
            for (int j = 0; j < str.length(); j++) {
                if(s.equals(str.charAt(j)+"")) {
                    count++;
                }
            }
            if (count==1 && !uniqueLetter.contains(s)) {

                uniqueLetter += s + "";
            }
        }
        return uniqueLetter;
    }


}
