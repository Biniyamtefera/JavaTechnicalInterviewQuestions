package earlyBirdQuestion;

import java.util.HashMap;
import java.util.Map;

public class mergeCounter {
    public static void main(String[] args) {
        /**
         * a = [1,2,3,4,10,20,30]  # random length between 1 to 10,000, random content 1 to 10,000
         * b = [20,30,1,2,1,3,4,4,5]
         *
         * def mergeCounter(a,b):
         * response = {}
         *
         *  # Rules:
         * # modify of array a and b is not allowed
         * # merge of a and b is not allowed
         * # you can only use one loop
         *
         *  ###
         * # TODO: Implement this function in below section
         * ###
         *
         *  # Output:
         *  #          Key: number
         * #          value: frequency of key from array a and b
         * # Example:
         * # a = [1,2,1,5]
         * # b = [1,3,3,4,5]
         * # response = {1:3,2:1,5:2,3:2,4:1}
         *
         */

        int []  a = {1,2,1,5,4};
         int [] b = {1,3,3,4,5};

        Map<Integer, Integer> map = new HashMap<>();
        int len =0;
        if(a.length>=b.length) {
            len = a.length;
        } else {
            len =b.length;
        }
        for (int i = 0; i < len; i++) {
            if(!map.containsKey(a[i] )|| !map.containsKey(b[i])) {
                map.put(a[i],1);
                map.put(b[i],1);
            }else {
                map.put(a[i],map.get(a[i]) + 1);
                map.put(b[i],map.get(b[i]) + 1);
            }

        }
        System.out.println(map);

    }
}
