package HashMap;

import java.util.*;

public class HashMapOperation {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // put(key,value) -- > O(1)
        map.put("India", 100);
        map.put("China", 200);
        map.put("Nepal", 300);
        System.out.println(map);

        // // get(key) --> O(1)
        System.out.println(map.get("India"));
        System.out.println(map.get("China"));

        // // containsKey(key) --> O(1)
        System.out.println(map.containsKey("India")); // true
        System.out.println(map.containsKey("Indonesia")); // false

        // // remove(key) --> O(1)
        System.out.println(map.remove("India"));
        System.out.println(map);
        System.out.println(map.remove("China", 200));
        System.out.println(map);

        // iteration on hashmap
        Set<String> keys = map.keySet();
        // System.out.println(map.entrySet());
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + ", value = " + map.get(k));
            ;
        }
    }
}