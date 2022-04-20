package prac.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingUsingDFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj, V);
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i])
                DFS(adj, i, st, visited);
        }

        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int i, Stack<Integer> st, boolean[] visited) {
        visited[i] = true;

        for (int v : adj.get(i)) {
            if (!visited[v])
                DFS(adj, v, st, visited);
        }

        st.push(i);
    }
}
