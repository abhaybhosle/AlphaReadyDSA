package PRIORITYQUEUE;
// Priority Queue for Objects
import java.util.PriorityQueue;

public class PqForObjects {
    public static class Student implements Comparable<Student> { //Comparable = interface
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) { //compareTo is a inbuiltFunction of the interface Comparable
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 100));
        pq.add(new Student("D", 10));
        pq.add(new Student("Z", 200));
        pq.add(new Student("P", 0));
        pq.add(new Student("R", 33));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }

    }
}
