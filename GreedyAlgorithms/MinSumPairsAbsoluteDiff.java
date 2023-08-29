package GreedyAlgorithms;

public class MinSumPairsAbsoluteDiff {
    public static void main(String[] args) {
        int a[] = { 3, 4, 31, 1 };
        int b[] = { 2, 7, 5, 4 };

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;

        for (int i = 0; i < a.length; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }
        System.out.println("Minimum Sum Pairs Absolute Difference = " + minDiff);
    }
}
