package PriorityQueue;

import java.util.ArrayList;

public class InsertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // insert
        public void add(int data) { // O(logn)
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is a child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1)/2;
            }

        }

        public int peek() {
            return arr.get(0); // It returs the min value of the BT .. as we know in case of Min-Heap the root
                               // contains the smalles value.
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndx = i;
            // lead node (left<arr.size)
            if (left < arr.size() && arr.get(minIndx) > arr.get(left)) {
                minIndx = left;
            }
            if (right < arr.size() && arr.get(minIndx) > arr.get(right)) {
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

            // step1 - swap first and last
            int temp = arr.get(0);
            arr.set(arr.get(0), arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 - delete last
            arr.remove(arr.size() - 1);

            // step3 - heapify
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(23);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }
}
