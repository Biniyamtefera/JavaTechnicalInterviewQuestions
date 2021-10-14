package youtubeVedioIQ.NavinIQ;

public class PrintOneToHundredWitthOutLoop {
    public static void main(String[] args) {


        printNum(1);

    }

    public static void printNum(int i) {
        /**
         * Print 1 to 100 without using loop
         */
        if (i <= 100) {
            System.out.println(i);
            i++;
            printNum(i);
        }
    }


    /**
     * Print number from 1..to 100
     * without
     * using any number in your code
     */
    public static void printOneTOOneHundred() {
        int one = 'A'/'A';
        String str = "**********";
        for (int i = one; i <= str.length()*str.length(); i++) {
            System.out.println(i);
        }
    }
    public static void printOneTOOneHundred2() {
        int one = 'A' / 'A';
        int num = 'd';
        for (int i = one; i <= num; i++) {
            System.out.println(i);
        }
    }
}
