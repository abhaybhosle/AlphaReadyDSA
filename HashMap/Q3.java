//Q: Given an array of integers, find the first non-repeating element in the array using a HashMap in Java.
package HashMap;

import java.util.*;

public class Q3 {
    public static int firstRe(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 3, 4, 5 };
        int result = firstRe(arr);
        System.out.println(result);
    }
}
