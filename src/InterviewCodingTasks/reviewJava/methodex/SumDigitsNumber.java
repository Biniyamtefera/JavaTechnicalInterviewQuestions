package InterviewCodingTasks.reviewJava.methodex;

import java.util.Scanner;

/**
 * Program starts and asks user to enter number
 * program  calls method which takes int as an argument and returns sum of all digits in this nuumber
 *
 */
public class SumDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();
        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return Math.abs(result);
    }
}
