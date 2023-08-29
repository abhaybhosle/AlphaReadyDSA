package LinkedList;

import java.util.LinkedList;

public class LinkedListJCF {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> l1 = new LinkedList<>();

        // add
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(0);
        System.out.println(l1);

        // remove
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
        
    }

}
