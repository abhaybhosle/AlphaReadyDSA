// Ques :
// Given a "2Xn" floor and tiles of size "2X1",count the number of ways to tile the given board using the 
// 2X1 tiles. (A tile can be placed either Vertically or Horizontally).

package Recursion;

public class TilingProblem {
    public static int tiling(int n) { // 2xn(size of tiles)
        if (n == 0 || n == 1) { // Base Case
            return 1;
        }
        // vertical placement of tiles
        int vertical = tiling(n - 1);
        // Horizontal placements of tiles
        int Horizontal = tiling(n - 2);
        // total number of ways of tile placement

        int total = vertical + Horizontal;
        return total;

    }

    public static void main(String[] args) {
        System.out.println("Total number of ways : ");
        System.out.println(tiling(2));

    }

}
