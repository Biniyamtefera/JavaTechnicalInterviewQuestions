package earlyBirdQuestion;

public class SumNumberFromString {
    public static void main(String[] args) {
        String str = "adsa1adas45asda153dfsd";

        sunNumber(str);
    }

    /**
     * String str = "adsa1adas45asda153dfsd";
     */

    public static void sunNumber(String str) {

        int num =0;
        int sum =0;

        for(int i=0; i < str.length(); i++) {
//adsa1adas45asda153dfsd
            if(Character.isDigit(str.charAt(i))) {
                num = str.charAt(i);
                if(Character.isDigit(str.charAt(i+1))) {
                    num = num*10 + str.charAt(i+1);
                }
            }
            sum += num;
            num=0;

        }
        System.out.println(sum);
    }
}
