package Arrays_in_2D;

import java.util.*;

public class Matrix_creation {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) { // to get any number if it is present in the matrix
                    System.out.println("(" + i + "," + j + ")"); // to get the key position
                    return true;

                }

            }

        }
        System.out.println("Not found");
        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < m; j++) { // columns
                matrix[i][j] = sc.nextInt();

            }

        }
        sc.close();
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        search(matrix, 10);

    }

}
