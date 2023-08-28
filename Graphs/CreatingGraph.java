package Graphs;

import java.util.ArrayList;

public class CreatingGraph {

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

    public static void main(String[] args) {

        int V = 5; // Total number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V]; // creating arrays of arrays . for every index there is a list

        for (int i = 0; i < V; i++) { // null -> empty arraylist
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 0, 5));

        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        graph[4].add(new Edge(4, 2, 2));

        for (int i = 0; i < graph[3].size(); i++) {
            Edge e = graph[3].get(i);
            System.out.println(e.dest);
            
        }

    }
}