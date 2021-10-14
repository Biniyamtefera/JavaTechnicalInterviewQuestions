package youtubeVedioIQ.IterableDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DiffrenceBnHashMapAndHashTable {
    public static void main(String[] args) {
        //=>HashMap non-synchronized HashTable synchronized (threade safe and not thread safe)

        HashMap<String, String> hasMap = new HashMap<>();

        Hashtable<String,String> hashTable = new Hashtable<>();

        //==>Hashmap allow one null key and multiple null value where as Hashtable doesn't allow any null key or value
        hasMap.put(null, "Biniyam");
        hasMap.put("a", null);
        hasMap.put("b", null);
       // hashTable.put(null, "biniyam");  ==> .NullPointerException
       // hashTable.put("Biniyam", null);  ==> .NullPointerException

        //==>HashMap is fast and Hashtable is slow because of Synchronization issue
        //==>We can make the HashMap as synchronized by calling this code
        Map map = Collections.synchronizedMap(hasMap);

        //==> HashMap is traversed by Iterator ..HashTable is traversed by Enumerator and Iterator

        // ==Notes
        //When to choose HashMAp over Hashtable
        //=> We should use hashMap for unsynchronized or single threaded application
        //=> it is worth mentioning that since JDK 1.8, HashTable has been deprecated.
        // However, ConcurentHashMap is greate Hashtable replacemnt. We should consider ConcurrentHashMap to use in application threads










    }
}
