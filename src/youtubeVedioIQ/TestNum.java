package youtubeVedioIQ;

public class TestNum {
    public static void main(String[] args) {

        /**
         * Compare two int numbers(Integer Caching)
         */
        int num1 =100;
        int num2 =100;

        int num3 =190;
        int num4 =190;

        Integer num5 =100;
        Integer num6 =100;

        Integer num7 =190;
        Integer num8 =190;

        if(num1==num2) {
            System.out.println("The two numbers are equal");
        }else{
            System.out.println("The two number is not equal");
        }
        if(num3==num4) {
            System.out.println("The two numbers are equal");
        }else{
            System.out.println("The two number is not equal");
        }
        if(num5==num6) {
            System.out.println("The two numbers are equal");
        }else{
            System.out.println("The two number is not equal");
        }
        //When the boiunday out of the integer intervale then it become false
        if(num7==num8) {
            System.out.println("The two numbers are equal");
        }else{
            System.out.println("The two number is not equal");
        }


    }
}
