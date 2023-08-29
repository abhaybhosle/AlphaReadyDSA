
package Arrays;

public class Pairs_in_Arrays {
    public static void pairs(int arr[]) {
        int totalpairs = 0; // for finding [total pairs = n(n-1)/2]
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpairs++;

            }
            System.out.println();

        }
        System.out.println("Total pairs = " + totalpairs);

    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs(arr);

    }

}
