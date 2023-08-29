package HashMap;

import java.util.*;

public class Q1 {
    public static int occurk(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (map.get(arr[i]) != null) {
                count = map.get(arr[i]);
            }
            map.get(arr[i] + count + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 1 };
        int n = arr.length;
        int k = 2;
        System.out.println(occurk(arr, n, k));
    }
}
