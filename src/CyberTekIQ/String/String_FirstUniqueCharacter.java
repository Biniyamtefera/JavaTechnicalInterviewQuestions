package CyberTekIQ.String;

public class String_FirstUniqueCharacter {
    /**
     * Write a program that can return the first non-repeated character from String
     * @param args
     */
    public static void main(String[] args) {

        String str = "dbbdacfcf";
        System.out.println("firstUnique(str) = " + firstUnique(str));

    }
    public static String firstUnique(String str) {

          int count = 0;
          String unique = "";
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                unique += str.charAt(i);
                break;
            }

        }
        return unique;
    }
}
