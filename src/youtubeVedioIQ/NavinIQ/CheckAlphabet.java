package youtubeVedioIQ.NavinIQ;

public class CheckAlphabet {
    public static void main(String[] args) {
        checkAlphabet('i');
    }
    public static void checkAlphabet(char ch) {

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vouwel");
                break;
            default :
                System.out.println(ch +" is consuanent");
                break;
        }
    }
}
