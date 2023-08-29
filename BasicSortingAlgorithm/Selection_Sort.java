package BasicSortingAlgorithm;

public class Selection_Sort {

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minPos] > arr[j]){//if we need to sort in decreasing order change to < (arr[minPos]<arr[j])
                    minPos = j;

                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        // bubblesort(arr);
        SelectionSort(arr);
        Printarr(arr);
    }
}

