package prac.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Also known as Kahn's Algorithm
public class TopologicalSortingUsingBFS {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj, V);
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] inDegree = new int[V];
        Queue<Integer> queue = new LinkedList<>();

        for (int u = 0; u < V; u++) {
            for (int x : adj.get(u)) {
                inDegree[x]++;
            }
        }

        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int v : adj.get(u)) {
                if (--inDegree[v] == 0)
                    queue.add(v);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

}
