package InterviewQuestions.methods;
/**
 Write a method that can divide two numbers without using division operator
 */
public class DividTwoNums {
    public static void main(String[] args) {
      int a =10,b=3;
        System.out.println("divide(16, 4) = " + divide(16, 4));
    }
    public static int divide(int a, int b) {
        //deterine the sign of result by checking eacj number
        int sign = (a <0 || b<0) ? -1 : 1;
        // Update both a and b positive
        //|-num|= num, or |num|= num,
        a =Math.abs(a);
        b = Math.abs(b);

        int quotient =0;
        while (a>=b) {
            a-=b;
            quotient++;
        }
          return sign * quotient;
    }

}
