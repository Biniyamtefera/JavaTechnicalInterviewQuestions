package InterviewProblemCanvas;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(546));
        System.out.println(isArmstrong1(371));

    }
    /**
     * Write a method that can check if a number is Armstrong  number (An Armstrong number of three digits is
     * an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371
     * is an Armstrong number since 3*3*3+ 7*7*7+ 1*1*1 = 371.
     * Write a program to find all Armstrong number in the range of 0 and 999)
     */

    public static boolean isArmstrong(int num) {

        boolean isArmstrong = true;
        int digit = 0;
        int newnum = num;
        int endDigit=0;
        int sum=0;
        int temp = num;

        while(temp > 0) {
           temp =  temp/10;  // 25 /10 ==>2
           digit++;
        }
        while (newnum > 0) {
            endDigit = newnum % 10;  // 37%10 ==> 7   3
            sum += (Math.pow(endDigit, digit));
            newnum = newnum/10;
        }
        System.out.println(sum);
        if(sum!=num) {
            return false;
        }
        return isArmstrong;
    }

    public static boolean isArmstrong1(int num) {
         int newNum = num;
         int digit=0;
         int lastDigit = 0;
         int sum =0;
        for (int i=0; newNum > 0 ; i++) {
            digit++;
            newNum = (newNum/10);
        }
        System.out.println(digit);
        for(int i=0; newNum > 0; i++) {
            lastDigit = newNum % 10;
            sum+=(lastDigit^(digit));
            newNum = (newNum/10);
        }
        System.out.println(sum);
        if(sum!=newNum) {
            return false;
        }
        return true;

    }

}
