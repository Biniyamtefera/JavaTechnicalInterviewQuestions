package CyberTekIQ.String;

import java.util.HashSet;
import java.util.Set;

public class Set_Interssection {
    public static void main(String[] args) {
        /**
         * Return a set to intersection of parameter Sets
         */
        Set<Object> set1 =  new HashSet<>();
        Set<Object> set2  = new HashSet<>();
        set1.add("17");
        set1.add("16");
        set1.add("12");
        set1.add("13");
        set1.add("11");
        set1.add("10");
        set2.add("16");
        set2.add("13");
        set2.add("15");
        set2.add("11");
        set2.add("19");
        set2.add("18");
        set2.add("17");

        System.out.println("getIntersection(set1, set2) = " + getIntersection(set1, set2));

    }

    /**
     * Please implement this method to
     * return a Set equal to the intersection of the parameter Sets
     * The method should not change the content of the parameter
     */
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        //retainAll ==> will give the list mentioned on that list
        if(a.size()>b.size()) {
            a.retainAll(b);
            return a;
        }else {
            b.retainAll(a);
            return b;
        }

    }
}
