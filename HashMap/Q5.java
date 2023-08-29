package HashMap;
//Q: Given an array of integers, find the pairs of numbers whose sum is equal to a given target using a HashMap in Java.
import java.util.*;

public class Q5 {
    public static void findPairs(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment)) {
                System.out.println("Pairs Found" + " " +arr[i] + "," + compliment);
            } else {
                map.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 7;
        findPairs(arr, target);
        
    }
}
