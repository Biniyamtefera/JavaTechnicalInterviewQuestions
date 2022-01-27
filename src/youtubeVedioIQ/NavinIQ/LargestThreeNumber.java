package youtubeVedioIQ.NavinIQ;

public class LargestThreeNumber {
    public static void main(String[] args) {
        largestNumber(16, 332, 44);
        largestNumber3(16,332, 44);
    }

    public static void largestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        } else if ( num2 > num3) {
            System.out.println(num2 + " is the largest number");
        } else  {
            System.out.println(num3 + " is the largest number");
        }
    }

    public static void largestNumber3(int num1, int num2, int num3) {
        if(num1   > num2) {
            if(num2 > num3) {
                System.out.println(num1 + " is the largest number");
            }
        } if (num2 > num3) {
            System.out.println(num2 + " is the largest ");
        } else {
            System.out.println(num3 + " is the largest");
        }
    }
}