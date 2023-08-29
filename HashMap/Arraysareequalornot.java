package HashMap;

import java.util.*;

public class Arraysareequalornot {
    public static boolean isequal(int a[], int b[], int m, int n) {
        if (m != n) {
            return false;
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : a) {
            if (map1.get(i) != null) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        for (int i : b) {
            if (map2.get(i) != null) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> i : map1.entrySet()) {
            Integer key = i.getKey();
            if (map2.get(key) != i.getValue()) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 4, 3, 2, 1 };
        int m = a.length;
        int n = b.length;
        boolean flag = isequal(a, b, m, n);
        if (flag == true) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
