package PriorityQueue;

import java.util.PriorityQueue;

public class PQinJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // By Default in case of Integer class - the number which is smallest is
        // assigned as the highest priority
        // if we want to reverse the order we can use -> PriorityQueue<Integer> pq = new
        // PriorityQueue<>(Comparator.reverseOrder);
        pq.add(3); // O(logn)
        pq.add(10);
        pq.add(2);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }

    }
}
