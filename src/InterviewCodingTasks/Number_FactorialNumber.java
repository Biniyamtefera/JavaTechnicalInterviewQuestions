package InterviewCodingTasks;

public class Number_FactorialNumber {

    /*
    Write a return method that returns the factorial number of any given number

        Ex:
                Input: 5
                outPut: 120

                because 5 * 4 * 3 * 2 * 1 = 120
     */
    public static void main(String[] args) {
        System.out.println(factorialNumber1(5));
    }


    public static int factorialNumber(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;

    }

    public static int factorialNumber1(int n) {
        int num = 1;

        while (n > 0) {
            num =n *num;
            n = n -1;
        }
        return num;
    }



}
