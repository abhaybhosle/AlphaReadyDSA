package Graphs;

import java.util.*;

public class BellmanFordAlgorithm {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void BellmanFord(ArrayList<Edge> graph[], int src) {
        int distance[] = new int[graph.length];
        for (int i = 0; i < distance.length; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        int Vertex = graph.length;
        // algo
        for (int i = 0; i < Vertex- 1; i++) { //pehle edges nikal lo
            
            for (int j = 0; j < graph.length; j++) { //phir vertex
                for (int k = 0; k < graph[j].size(); k++) { //phir har vertex kae liye edge
                    Edge e = graph[j].get(k);
                    // u,v,wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation step
                    if (distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]) {
                        distance[v] = distance[u] + wt;
                        
                    }
                }
            }
        }
        // print
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        BellmanFord(graph, src);

    }
}
