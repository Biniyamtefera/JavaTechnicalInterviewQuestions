package InterviewCodingTasks;

public class Number_Armstrong {

    /*
    Write a method that can check if a number is Armstrong number
    Anumber which has the same from frot and backword  3443

     */
    public static void main(String[] args) {
        int num = 12321;
        System.out.println("isArmStrongNumber2(num) = " + isArmStrongNumber2(num));
    }

    public boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }

   public static boolean isArmStrongNumber2(int num) {
        int oriNum= num;
        int rem= 0;
        int reverse = 0;
        boolean isArmstrong = false;
        for(; num> 0;) {
            rem = num % 10;
            num= num/10;
            reverse = rem + reverse*10;
        }
        if(reverse==oriNum) {
          return   isArmstrong = true;

        }
        return isArmstrong;

   }

}
