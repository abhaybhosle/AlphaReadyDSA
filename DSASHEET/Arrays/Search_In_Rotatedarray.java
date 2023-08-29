package DSASHEET.Arrays;

public class Search_In_Rotatedarray {
    public static int searchinrotatedarray(int arr[], int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[lo] <= arr[mid]) {
                // Lo to mid part is sorted
                if (target >= arr[lo] && arr[mid] > target) {
                    hi = mid - 1;

                } else {
                    lo = mid + 1;
                }

            } else if (arr[mid] <= arr[hi]) {
                // mid to hi is sorted
                if (target > arr[mid] && arr[hi] >= target) {
                    lo = mid + 1;

                } else {
                    hi = mid - 1;
                }

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(searchinrotatedarray(arr, target));
        ;
    }

}
