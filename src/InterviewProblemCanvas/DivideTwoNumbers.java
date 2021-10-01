package InterviewProblemCanvas;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(divisor(21, 4));
    }
    public static int divisor(int a, int b) {
       int count =0;
       int sign = (a < 0 || b <0) ? -1 : 1;
       a = Math.abs(a);
       b = Math.abs(b);
       while (a >=b) {
           a-=b;
           count++;
       }
       return count * sign;
    }
}
