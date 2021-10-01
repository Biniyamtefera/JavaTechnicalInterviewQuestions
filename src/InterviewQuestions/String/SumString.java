package InterviewQuestions.String;
/*
Write a method that can return the sum of the digits in a string
// the string contain both
 */
public class SumString {
    public static void main(String[] args) {
        String str = "12d5df6jj4h4hh4";
        sum(str);

    }

    public static void sum(String str) {

        int sum =0;
        for (int i=0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                int temp = Integer.parseInt(each +"");
                sum +=temp;
            }
        }
        System.out.println(sum);
    }


}
