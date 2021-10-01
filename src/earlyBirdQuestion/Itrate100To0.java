package earlyBirdQuestion;

public class Itrate100To0 {
    /**
     * Iterate 100 0
     */
    public static void main(String[] args) {
//        int num =100;
//        for (int i = num; i >=0 ; i--) {
//            System.out.println(i);
//        }
        itrate(100);
    }
    public static void itrate(int num) {

        if (num <=0) {
            System.out.println(num);
            num--;
            itrate(num);
        }
    }
}
