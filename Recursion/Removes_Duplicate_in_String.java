package Recursion;

public class Removes_Duplicate_in_String {
    public static void removesDuplicate(String str, int indx, StringBuilder newStr, boolean map[]) {
        // Base Case
        if (indx == str.length()) {
            System.out.println(newStr);
            return;
        }
        int currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removesDuplicate(str, indx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removesDuplicate(str, indx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removesDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
