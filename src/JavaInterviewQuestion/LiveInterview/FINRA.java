package JavaInterviewQuestion.LiveInterview;

public class FINRA {
    /**
     * Write a method which prints out teh numbers from 1 to 30 but for numbers
     * which are a multiple of 3, print "FIN" instead of the number and for numbers
     * which are a multiple of 5, print "RA" instead of the number for numbers which
     * are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void main(String[] args) {

        FINRA(30);
    }

    public static void FINRA (int num) {
        //1-30
        //num=>3 FIN
        //num -> 5 RA
        //num -> 3 & 5 FINRA
        for(int i =1; i<=num;i++) {
            if(i% 3==0 &&i % 5 ==0) {
                System.out.println("FINRA");
            }else if(i%3==0) {
                System.out.println("FIN");
            }else if(i%5==0) {
                System.out.println("Ra");
            } else{
                System.out.println(i);
            }
        }

    }
}
