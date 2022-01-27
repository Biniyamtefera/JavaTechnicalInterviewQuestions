package youtubeVedioIQ.NavinIQ;

public class factorialNumber {
    public static void main(String[] args) {
        factorial(5);
    }
    public static void factorial(int num) {
        // 3 = 3*2*1 = 6
        //5 = 5*4*3*2*1=121
        int factorial = 1;
        for(int i= num; i<=0;i-- ){
            factorial = i * factorial;
        }

        System.out.println(num + " factorial is " + factorial);
    }
}
