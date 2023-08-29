package PRIORITYQUEUE;

import java.util.*;

// Min Heap
public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is a child index
            int parent = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(parent)) { // change sign for MaxHeap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndx = i;

            if (left < arr.size() && arr.get(minIndx) > arr.get(left)) { // change sign for MaxHeap
                minIndx = left;
            }

            if (right < arr.size() && arr.get(minIndx) > arr.get(right)) { // change sign for MaxHeap
                minIndx = right;
            }

            if (minIndx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndx));
                arr.set(minIndx, temp);

                heapify(minIndx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1 - > swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 -> delete last
            arr.remove(arr.size() - 1);

            // step 3 -> heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(1);
        h.add(13);
        h.add(34);
        h.add(77);
        h.remove();

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
