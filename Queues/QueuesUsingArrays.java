package Queues;

public class QueuesUsingArrays {
    public static class Queues {
        int arr[];
        int size;
        int rear;

        Queues(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }
            return arr[0];

        }

    }

    public static void main(String[] args) {
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
