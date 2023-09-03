package Graphs;

import java.util.*;

public class CycleDetectionForDirectedGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        // graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
        
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    //DFS
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true; //add node to the stack

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case 1 - if the destinatin value is already in the stack then return true. eg in case of 3 ,, the neighbour is 0 which is alreadt present in the stack , so it forms cycle ,,and return true.
            if (stack[e.dest]) {
                return true;
            }
            //case 2 - if neighbour is not visited and cycle is present then return true
             else if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;//remove node from the stack
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));

    }
}
