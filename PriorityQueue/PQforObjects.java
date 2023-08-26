package PriorityQueue;

import java.util.PriorityQueue;

public class PQforObjects {
    static class Student implements Comparable<Student> { // The student class is implementing the
                                                          // interface(Compareble<Student) so that now the
                                                          // classes(Student) can compare their objects.
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) { //syntax - classes can compare their objects
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 2));
        pq.add(new Student("D", 5));
        pq.add(new Student("C", 1));
        pq.add(new Student("B", 10));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }

    }
}
