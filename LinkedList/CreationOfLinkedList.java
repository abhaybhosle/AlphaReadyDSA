package LinkedList;

public class CreationOfLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // creating new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head; // link

        // step 3 - newNode = head;
        head = newNode;

    }

    public void addLast(int data) {
        // creating new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode = next

        tail.next = newNode;

        // step 3 - newNode = tail
        tail = newNode;
    }

    public void Print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add element in the middle or insert
    public void add(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        // i = indx-1 ; temp => prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removing the first node from linked list
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last node
    public int removeLAst() {
        if (size == 0) {
            System.out.println("Linked list is empty ");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // Iterative search
    public int IterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1; // key not dound
    }

    // Recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    public int RecursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse a linked list
    // 3 variables and 4 steps
    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and remove Nth node from the end

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

        }
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // Check if LL is a Palindrome
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        // BAse CAse
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 --> find middle
        Node mid = findMidNode(head);
        // Reverse 2nd part
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check if equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        CreationOfLinkedList l1 = new CreationOfLinkedList();
        // l1.Print();
        l1.addFirst(2);
        l1.Print();
        // l1.addFirst(1);
        // // l1.Print();
        // l1.addLast(3);
        // // l1.Print();
        // l1.addLast(4);
        // l1.add(2, 9);
        // l1.Print();
        // System.out.println(size); // size of the linked list

        // l1.removeFirst();
        // l1.Print();

        // l1.removeLAst();
        // l1.Print();

        // System.out.println(l1.IterativeSearch(3));
        // System.out.println(l1.IterativeSearch(10));

        // System.out.println(l1.IterativeSearch(3));
        // System.out.println(l1.IterativeSearch(10));

        // l1.Reverse();
        // l1.Print();

        // l1.deleteNthfromEnd(3);
        // l1.Print();

        // // palindrome
        // l1.addFirst(1);
        // l1.addFirst(2);
        // l1.addFirst(2);
        // l1.addFirst(1);
        // l1.Print();
        // System.out.println(l1.checkPalindrome());

    }

}
