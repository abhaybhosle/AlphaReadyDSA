/*Create a function boolean startWith(String prefix) for a trie.
Return true if there is a previously inserted string word that has the prefix and false otherwise
words[] = {"apple","app","mango","man","woman"}
prefix = "app" :  output = true
prefix = "moon" : output = false
*/
package Tries;

public class startsWithProblem {
    static class Node {
        Node children[] = new Node[26];

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String arr) { // O(L) where L - largest string length
        Node curr = root;
        for (int level = 0; level < arr.length(); level++) {
            int indx = arr.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];

        }
    }

    public static boolean search(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int indx = prefix.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "appman", "apple", "mango", "man" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        String prefix = "app";
        System.out.println(search(prefix));

    }

}
