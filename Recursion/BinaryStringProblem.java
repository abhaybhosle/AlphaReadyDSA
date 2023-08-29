// Ques : Print all binary Strings of size N without consecutive ones.
package Recursion;

public class BinaryStringProblem {
    public static void PrintBinStrings(int n, int lastPlace, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        PrintBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            PrintBinStrings(n - 1, 1, str + "1");

        }

    }

    public static void main(String[] args) {
        PrintBinStrings(3, 0, "");

    }

}
