package prac.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInDirectedGraphUsingTopologicalSort {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 4, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 1);

        topologicalSort(adj, V);
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        int count = 0;
        int[] inDegree = new int[V];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            for (int x : adj.get(i)) {
                inDegree[x]++;
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adj.get(u)) {
                if (--inDegree[v] == 0)
                    queue.add(v);
            }
            count++;
        }

        if (count != V)
            System.out.println("Cycle found");
        else
            System.out.println("There is no cycle");
    }
}
