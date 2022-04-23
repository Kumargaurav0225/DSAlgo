package prac.graphs.bridge;

import java.util.Arrays;
import java.util.LinkedList;

class Graph {
    private int V;
    private LinkedList<LinkedList<Integer>> adj;
    int time = 0;
    static final int NIL = -1;

    Graph(int v) {
        V = v;
        adj = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<>());
        }
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    void bridgeUtil(int currNode, boolean[] visited, int[] discTime, int[] lowestDiscTime, int[] parent) {
        visited[currNode] = true;
        discTime[currNode] = lowestDiscTime[currNode] = ++time;

        for (int adjNode : adj.get(currNode)) {
            if (!visited[adjNode]) {
                parent[adjNode] = currNode;
                bridgeUtil(adjNode, visited, discTime, lowestDiscTime, parent);

                lowestDiscTime[currNode] = Math.min(lowestDiscTime[currNode], lowestDiscTime[adjNode]);
                if (lowestDiscTime[adjNode] > discTime[currNode])
                    System.out.println(currNode + " " + adjNode);
            } else if (adjNode != parent[currNode])
                lowestDiscTime[currNode] = Math.min(lowestDiscTime[currNode], discTime[adjNode]);
        }
    }

    void bridge() {
        boolean[] visited = new boolean[V];
        int[] discTime = new int[V];
        int[] lowestDiscTime = new int[V];
        int[] parent = new int[V];

        Arrays.fill(parent, NIL);

        for (int node = 0; node < V; node++)
            if (!visited[node])
                bridgeUtil(node, visited, discTime, lowestDiscTime, parent);
    }

    public static void main(String[] args) {
        System.out.println("Bridges in first graph ");
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.bridge();
    }

}