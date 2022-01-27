package youtubeVedioIQ.NavinIQ;

public class PostiveOrNegative {
    public static void main(String[] args) {
   checkSign(-56);
    }

    public static void checkSign(int num) {
        if (num==0) {
            System.out.println(num + " neither posetive nor negative");

        } else if(num > 0) {
            System.out.println(num + " is posetive number");
        } else {
            System.out.println(num + "  is negative number");
        }
    }
}
