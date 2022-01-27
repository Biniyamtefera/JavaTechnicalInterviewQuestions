package InterviewCodingTasks;

public class Number_SwapTwoNumbers {

    /*
    Swap two variable' values without using a third variable
     */
    public static void main(String[] args) {
        swap3(5,10);
    }

    //solution 1
    public void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    //solution 2
    public void swap2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swap3(int a, int c) {
         a= a + c;
         c= a - c;
         a= a - c;

        System.out.println("a" + " is " + a);
        System.out.println("c" + " is " + c);

    }


}
