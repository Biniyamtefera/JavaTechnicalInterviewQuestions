package InterviewQuestions.conditional;
/**18. Write  a method which can identifies given number is even or odd
 EX: identify(5) ->  "Odd"
 identify(6) ->  "Even"
 */
public class oddOrEvenNum {
    public static void main(String[] args) {

        int num= 15;
        System.out.println("isEvenOrOdd(6) = " + isEvenOrOdd(num));

    }
    public static String isEvenOrOdd(int num) {
        String isEvenOrOdd = "";

        if(num % 2==0) {
            isEvenOrOdd = "Even";
        } else{
            isEvenOrOdd = "odd";
        }
        return isEvenOrOdd;
    }
}
