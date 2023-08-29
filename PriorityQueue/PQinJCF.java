package PRIORITYQUEUE;
import java.util.PriorityQueue;

public class PqInJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(1);
        pq.add(66);
        pq.add(22);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
