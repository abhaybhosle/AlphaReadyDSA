package HashMap;

import java.util.*;

public class ImplementationOfHashMap {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of nodes
        private int N; // size of the bucket
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N; // it help to get the hasCode in the correct range(0-3)
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> l1 = buckets[bi];
            int di = 0;
            for (int i = 0; i < l1.size(); i++) {
                Node node = l1.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;

        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes --> add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> l1 = oldBuck[i];
                for (int j = 0; j < l1.size(); j++) {
                    Node node = l1.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(lambda)-->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            // case 3
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }

        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> l1 = buckets[i];
                for (Node node : l1) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}
