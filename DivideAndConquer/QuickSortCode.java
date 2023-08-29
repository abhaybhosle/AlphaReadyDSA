package DivideAndConquer;

public class QuickSortCode {
    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }
        // last element
        int p1dx = partion(arr, si, ei);
        quicksort(arr, si, p1dx - 1); // left
        quicksort(arr, p1dx + 1, ei); // right
    }

    public static int partion(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { // if condition is true we have to make space for the element n swap.
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now for storing the pivot value at correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quicksort(arr, 0, arr.length - 1);
        Printarr(arr);
    }

}
