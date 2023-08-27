package Tries;

public class tries {

    static class Node {
        Node children[] = new Node[26];
        boolean eow; //EndOfWord

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null; //initialize all the children nodes as null
            }
        }
    }

    public static Node root = new Node(); //create a new root

    public static void insert(String words) { //O(L) where L - largest string length
        Node curr = root;
        for (int level = 0; level < words.length(); level++) {
            int indx = words.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];

        }
        curr.eow = true;
    }

    public static boolean search(String key) { //O(L)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int indx = key.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key = "any";
        System.out.println(search(key));

    }
}
