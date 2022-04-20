package prac.graphs;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 2, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 3);

        if (DFS(adj, V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (DFSRec(adj, i, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    private static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[] recStack) {
        visited[i] = true;
        recStack[i] = true;

        for (int u : adj.get(i)) {
            if (!visited[u] && DFSRec(adj, u, visited, recStack)) {
                return true;
            } else if (recStack[u]) {
                return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
