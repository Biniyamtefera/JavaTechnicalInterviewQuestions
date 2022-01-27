package youtubeVedioIQ.NavinIQ;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        comp(30,6);
    }

    public static void comp(int dividend, int divisor) {
        int quetion = dividend/divisor;
        int remainder = dividend% divisor;

        System.out.println("quetion = " + quetion);
        System.out.println("remainder = " + remainder);
    }
}
