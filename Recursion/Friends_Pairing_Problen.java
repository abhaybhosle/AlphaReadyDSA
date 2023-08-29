/* 
 Ques -- Given n friends,each one can remain single or can be paired with some other froend.
Each friend can pe paired only once . Find out the total number of ways in which friend can remain
single or can be paired up.
  */

package Recursion;

public class Friends_Pairing_Problen {
    public static int friendPairing(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = friendPairing(n - 1);

        // pairs
        int fnm2 = friendPairing(n - 2);
        int pairways = (n - 1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairways;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(3));

    }

}
