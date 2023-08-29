package Recursion;

public class array_is_sorted_or_not {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) { // Base Case
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3, 4}; // you can also  check for the pairs
        
        System.out.println(isSorted(arr, 0));

    }

}
