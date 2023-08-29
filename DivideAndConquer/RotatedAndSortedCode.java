package DivideAndConquer;

public class RotatedAndSortedCode {
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = (si + ei) / 2;

        // Case Found
        if (arr[mid] == target) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // case b : right
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on l2
        else {
            // case c : right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // case d = left
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 60, 1, 2, 3 };
        int target = 2;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

}
