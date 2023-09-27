package SlidingWindow;
/*
 Given an array and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.
    Input :
    N = 5
    A[] = {-8,2,3,-6,10}
    K = 2;

    Output :
    -8 0 -6 -6 

    Explanation : 
    First negative integer for each window of size k
    {-8,2} = -8
    {2,3} = 0 (does not contain a negative integer)
    {3,-6} = -6
    {-6,10} = -6
 */
import java.util.*;

public class Q2_FirstNegativeInSubarray {
    public static ArrayList<Integer> firstNegative(int[] arr, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int i = 0, j = 0;

        while (j < n) {
            // Check if the current element is negative and add it to the queue
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            // If the window size is not yet k, just move the right pointer (j)
            if (j - i + 1 < k) {
                j++;
            }
            // When the window size reaches k, store the first negative element and move
            // both pointers
            else if (j - i + 1 == k) {
                // If the queue is empty, there is no negative element in the current subarray
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(q.peek()); // The front of the queue contains the first negative element
                    if (arr[i] == q.peek()) {
                        q.poll(); // If the element going out of the window is the first negative, remove it from
                                  // the queue
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] arr = {-8,2,3,-6,10};
        ArrayList<Integer> a = firstNegative(arr, n, k);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}
