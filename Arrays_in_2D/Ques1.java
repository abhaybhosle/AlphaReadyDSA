//Question 1 :Print the number of 7’s that are inthe 2d array.
//Example:
//Input - int[][] array = { {4,7,8},{8,8,7} };
//Output - 2

package Arrays_in_2D;

public class Ques1 {
    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int countof7 = 0;
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[0].length; j++) {// columns
                if (arr[i][j] == 7) {
                    countof7++;

                }

            }

        }
        System.out.println("count of 7 is : " + countof7);
    }

}
