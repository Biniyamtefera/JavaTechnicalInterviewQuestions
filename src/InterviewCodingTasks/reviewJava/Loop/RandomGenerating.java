package InterviewCodingTasks.reviewJava.Loop;

import java.util.Random;

public class RandomGenerating {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt();
        int num2 = ran.nextInt(100);
        int num3 = ran.nextInt(100) +1;

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}
