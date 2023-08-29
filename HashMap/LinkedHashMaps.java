package HashMap;

import java.util.*;

public class LinkedHashMaps { // the order is based on the key insertion
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Nepal", 45);

        System.out.println(lhm);
    }
}
