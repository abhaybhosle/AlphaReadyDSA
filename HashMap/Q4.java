//Q: Given two arrays of integers, find the intersection of the two arrays using a HashMap in Java
package HashMap;

import java.util.*;

public class Q4 {
    public static int[] findIntersection(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int key = arr1[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int key = arr2[i];
            if (map.containsKey(key) && map.get(key) > 0) {
                list.add(key);
                map.put(key, map.get(key) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        int result[] = findIntersection(arr1, arr2);
        System.out.println("Intersection of 2 arrays : " + Arrays.toString(result));

    }
}
