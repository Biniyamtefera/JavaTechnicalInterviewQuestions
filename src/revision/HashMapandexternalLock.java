package revision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapandexternalLock {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("Biniyam", "Ethiopia");
        hashtable.put("Mekdes", "Ethiopia");
        hashtable.put("Rediet","Ethiopia");
        hashtable.put("Zebib", "Erteria");

        System.out.println(hashtable);


        // create HashMap
        Map<String,String> map = new HashMap<String,String>();

        // populate the map
        map.put("1","Malay");
        map.put("2","Ankit");
        map.put("3","Chintan");

        //Create Synchronized map
        /**
         * SynchronizedMap is a static inner class of utility class java.util.Collections.
         * It is quite similar to Hashtable and it also acquires lock on entire Map instance.
         * It is not a legacy class like Hashtable and  it was introduced in jdk 1.5.
         */
        Map<String, String> synchMap = Collections.synchronizedMap(map);

    }

}
