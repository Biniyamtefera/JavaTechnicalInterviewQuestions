package InterviewProblemCanvas;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        swapNumber(a, b);
        swapNumber2(a, b);
    }

    public static void swapNumber(int a, int b) {
        int temp = b;
        b= a;
        a=temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    public static void swapNumber2(int a, int b){
        a = a + b;
        b = a-b;
        a= a-b;

        System.out.println("a =" + a);
        System.out.println("b =" + b);


    }

}
