/*
We are given a string S,we need to find the count of all contiguous substrings starting and 
ending with the same character
 */
package Recursion.Assignment;

public class Solution4 {
    public static int countsubstring(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countsubstring(str, i + 1, j, n - 1) +
                countsubstring(str, i, j - 1, n - 1) -
                countsubstring(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countsubstring(str, 0, n - 1, n));

    }

}
