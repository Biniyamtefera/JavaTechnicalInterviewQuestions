package InterviewQuestions.String;
/*
 A Prime Number: Write a Java program to check if a given number is prime or not. Remember,
 a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
 Be prepared for cross, e.g. checking till the square root of a number, etc.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 35;
        boolean isPrime = true;


        for (int i = 2; i < num; i++) {
            if ((num % i == 0)) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

        primeNum(35);

    }

    public static void primeNum(int num) {
        boolean prime = false;
        if (num <=0 || num==1) {
            prime = false;
        }
        for (int i = 2; i <= num-1; i++) {
            if (i == num) {
                prime = true;
            }
            if (num % i == 0) {
                break;
            }
        }
        System.out.println(prime);
    }


}
