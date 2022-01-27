package earlyBirdQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestAndHigher {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,33,55,22,67,63,67,50,33,11,3,0);
        int higS = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        //we can do also with out limit
        int higS2 = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        System.out.println(higS);
        System.out.println(higS2);

        int lowF = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        int lowF2 = list.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println(lowF);
        System.out.println(lowF2);

    }
}
