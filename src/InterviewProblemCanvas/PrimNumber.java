package InterviewProblemCanvas;
/**
 Write a method that can check if a number is prime or not
 */
public class PrimNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(49));
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
