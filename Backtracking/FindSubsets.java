package Backtracking;

public class FindSubsets {
    public static void findsub(String str, int i, String ans) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // Yes choice
        findsub(str, i + 1, ans + str.charAt(i));
        // No choice
        findsub(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        findsub(str, 0, "");

    }
}
