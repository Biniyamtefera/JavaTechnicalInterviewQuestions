package InterviewCodingTasks;

public class Number_Fibonacci {
    public static void main(String[] args) {
        fibonacci2(5);
        System.out.println("fibonacci(5) = " + fibonacci(5));

    }

    public static int fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;
        //1,1,2,3,5,813
        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }

    public static void fibonacci2(int num) {
        int j = 0;
        int z = 1;
        int result = 0;

        for (int i = 0; i < num; i++) {
            result = z + j;
            j = z;
            z = result;
            System.out.println(result);
        }

    }
}
