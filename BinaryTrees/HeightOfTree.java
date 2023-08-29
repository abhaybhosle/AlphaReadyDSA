package BinaryTrees;

public class HeightOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Count number of nodes

    public static int CountNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int countLeft = CountNodes(root.left);
        int countRight = CountNodes(root.right);
        return countLeft + countRight + 1;
    }

    //sum of nodes

    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum+rightSum+root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(CountNodes(root));
        System.out.println(Sum(root));

        /*
                            1
                           / \
                           2  3
                          / \ / \
                          4 5 6 7
         */

    }

}
