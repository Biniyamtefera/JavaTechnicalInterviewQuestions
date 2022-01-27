package InterviewCodingTasks;

public class Number_ReverseInteger {
  //

    public static void main(String[] args) {
        System.out.println(reverse2(345456));
    }
    public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    // reverse number
    // if between 0-10 then return the same number

    public static int reverse2(int num) {
        if(num >= 0 && num < 10) {
            return  num;
        }
        int result = 0;

        while(num > 0) {
            result = result*10 + num % 10;
            num = num / 10;
        }
        return result;
    }


}
