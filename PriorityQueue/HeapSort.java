package PriorityQueue;

public class HeapSort {
    public static void Heapify(int arr[], int i, int size) {
        //maxheap
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndx = i;

        if (left < size && arr[left] > arr[maxIndx]) {
            maxIndx = left;
        }
        if (right < size && arr[right] > arr[maxIndx]) {
            maxIndx = right;
        }

        if (maxIndx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;

            Heapify(arr, maxIndx, size);
        }
    }

    public static void heapSort(int arr[]) {
        // step1 - build maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            Heapify(arr, i, n);
        }

        // step2 - push largest at the end
        for (int i = n - 1; i > 0; i--) {
            // swap (largest - first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heapify(arr, 0, i);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
