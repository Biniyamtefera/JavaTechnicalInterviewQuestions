package InterviewProblemCanvas;

public class SumNumZero {
    public static void main(String[] args) {
         int N=0;
         findNumbers(5);

    }

    public static void findNumbers(int n) {

        for (int i=0; i<n;i++) {
            if (n%2!=0) {
                System.out.println(i + "," + -i + "," + 0);
            }
            if(n % 2 ==0) {
                System.out.println(i+ "," + -i );
            }
        }

    }
}
