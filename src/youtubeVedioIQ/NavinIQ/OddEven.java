package youtubeVedioIQ.NavinIQ;

public class OddEven {
    public static void main(String[] args) {
        oddEven(9);
    }
    public static void oddEven(int num) {


        if(num ==0) {
            System.out.println("Nether even nor odd");
        }else if(num % 2 ==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
