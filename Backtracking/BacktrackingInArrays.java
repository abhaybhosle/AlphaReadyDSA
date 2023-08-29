package Backtracking;

public class BacktrackingInArrays {
    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if (i == arr.length) {
            Printarr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        // backtracking
        arr[i] = arr[i] - 2;

    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        Printarr(arr);
    }
}
