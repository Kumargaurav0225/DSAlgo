package prac.graphs.shortestpathdag;

import java.util.*;

public class Graph {
    private int V;
    private ArrayList<ArrayList<AdjListNode>> adj;

    public Graph(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, int weight) {
        AdjListNode node = new AdjListNode(v, weight);
        adj.get(u).add(node);
    }

    public void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {

        visited[v] = true;

        for (AdjListNode node : adj.get(v)) {
            if (!visited[node.getV()])
                topologicalSortUtil(node.getV(), visited, stack);
        }

        stack.add(v);
    }

    public void shortestPath(int s) {
        Stack<Integer> stack = new Stack<>();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < V; i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);

        dist[s] = 0;
        relaxThePath(stack, dist);
        print(dist);
    }

    private void relaxThePath(Stack<Integer> stack, int[] dist) {
        while (!stack.empty()) {
            int u = stack.pop();
            if (dist[u] != Integer.MAX_VALUE) {
                for (AdjListNode adjNode : adj.get(u)) {
                    if (dist[adjNode.getV()] > dist[u] + adjNode.getWeight())
                        dist[adjNode.getV()] = dist[u] + adjNode.getWeight();
                }
            }
        }
    }

    private void print(int[] dist) {
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print("INF ");
            else
                System.out.print(dist[i] + " ");
        }
    }
}
