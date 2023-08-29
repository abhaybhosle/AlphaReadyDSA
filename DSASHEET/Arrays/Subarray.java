package DSASHEET.Arrays;

public class Subarray {
    public static void PrintSubArrays(int numbers[]) {
        int totalsubarrays = 0; // for finding [total subarrays = n(n+1)/2]
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(numbers[k] + " ");// subarray
                    totalsubarrays++;

                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("total subarrays = " + totalsubarrays);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintSubArrays(numbers);
    }

}
