package youtubeVedioIQ.NavinIQ;

public class SwapTwoNumber {
    public static void main(String[] args) {
        swap(5,10);
        swap2(5, 10);
    }
    public static void swap(int num1, int num2) {

        int temp = num1;
        num1 = num2;
        num2 =temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void swap2(int num1, int num2) {
        int num3  =  num1 + num2;
        num1 = num3-num1;
        num2 = num3 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
