package DSASHEET.Strings;

public class ValidPalindrome {
    public static boolean Palidrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama" ;
        System.out.println(Palidrome(s));
    }
}
