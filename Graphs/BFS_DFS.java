package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // starting index - we can take any node
        boolean visited[] = new boolean[graph.length]; // to keep track that no node is repeated

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) { // if the element is not visited then it will go to loop
                System.out.print(curr + " "); // step 1 - print the current value
                visited[curr] = true; // make the value as visited i.e true
                for (int i = 0; i < graph[curr].size(); i++) { // find all the neighbouring nodes of the curr number
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // If a graph has a path or not
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) { // O(V+E)
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    // Connected graphs :

    // public static void bfs(ArrayList<Edge>[] graph) {
    // boolean visited[] = new boolean[graph.length];
    // for (int i = 0; i < graph.length; i++) {
    // if (!visited[i]) {
    // bfsUtil(graph, visited);
    // }
    // }
    // }

    public static void bfsUtil(ArrayList<Edge> graph[], boolean visited[]) { // Helper function
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) { // if the element is not visited then it will go to loop
                System.out.print(curr + " "); // step 1 - print the current value
                visited[curr] = true; // make the value as visited i.e true
                for (int i = 0; i < graph[curr].size(); i++) { // find all the neighbouring nodes of the curr number
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // bfs(graph);
        // dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));

    }
}
