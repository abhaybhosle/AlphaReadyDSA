
// package BasicSortingAlgorithm;

// public class Insertion_Sort {
//     public static void insertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int prev = i - 1;
//             while (prev >= 0 && arr[prev]>current) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev + 1] = current;

//         }
//     }

//     public static void Printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 2, 3, 1, 7 };
//         insertionSort(arr);
//         Printarr(arr);
//     }
// }
package BasicSortingAlgorithm;

public class Insertion_Sort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = current;
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1, 7 };
        insertionSort(arr);
        Printarr(arr);

    }
}
