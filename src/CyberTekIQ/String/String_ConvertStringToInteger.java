package CyberTekIQ.String;

public class String_ConvertStringToInteger {

    /**
     * Write a program that can convert a string to integer. Do Not use parse or ValueOf methods
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("convert(\"1234\") = " + convert("1234"));
    }
    public static int convert(String str) {
        int num =0;
        int factor =1;
        for (int i = str.length()-1; i >=0 ; i--) {
            char each = str.charAt(i);  //4  3
            num +=(each-'0')*factor;  //4  30
            factor *=10;  //10
        }
        return num;
    }
}
