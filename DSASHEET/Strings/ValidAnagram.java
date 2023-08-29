package DSASHEET.Strings;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int ch[] = new int[26];
        int ch2[] = new int[26];
        if (t.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
            ch2[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(ch, ch2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }
}
