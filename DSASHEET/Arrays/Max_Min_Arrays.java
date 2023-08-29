package DSASHEET.Arrays;

import java.util.*;

public class Max_Min_Arrays {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];

            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        sc.close();
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number= " + max);

    }
}
