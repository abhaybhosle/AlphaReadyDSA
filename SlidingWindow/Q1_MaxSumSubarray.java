package SlidingWindow;

/*
    Given an array of integers arr of size n and a number k. Return the maximum sum of a subarray of size k.
    Example :

    Input :
    n = 4, k = 2
    arr = [100,200,300,400]

    Output
    700

    Explanation:
    arr3 + arr4 = 700,
    which is maximum
 */
public class Q1_MaxSumSubarray {

    public static int maximumSumSubarray(int k, int[] arr, int n) {
        int i = 0; // Left pointer of the sliding window
        int j = 0; // Right pointer of the sliding window
        int sum = 0; // Stores the current sum of the subarray
        int ans = Integer.MIN_VALUE; // Stores the maximum sum found

        // Traverse the array with the right pointer 'j'
        while (j < n) {
            sum += arr[j]; // Add the element at 'j' to the current sum
            if (j - i + 1 < k) {
                // If the size of the subarray is less than 'k', move the right pointer 'j'
                j++;
            } else if (j - i + 1 == k) {
                // If the size of the subarray is equal to 'k', calculate the maximum sum
                ans = Math.max(ans, sum);
                sum -= arr[i]; // Remove the element at 'i' from the sum
                i++; // Move the left pointer 'i' to slide the window
                j++; // Move the right pointer 'j' to continue sliding the window
            }
        }
        return ans; // Return the maximum sum found
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400 };
        int n = arr.length;
        int k = 2;
        int result = maximumSumSubarray(k, arr, n);
        System.out.println("Maximum sum of a subarray of size " + k + ": " + result);
    }
}
