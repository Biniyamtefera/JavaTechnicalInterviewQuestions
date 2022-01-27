package InterviewCodingTasks;

public class Number_SumOfDigitsOfInteger {

    /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6

     */

    public static void main(String[] args) {
        sumDigit1(234);
    }
    public int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    public static void sumDigit1(int num) {

        int remainder = 0;
        int sum =0;
        while (num > 0) {
            sum += num % 10;
            num = num /10;
        }
        System.out.println(sum);
    }


}
