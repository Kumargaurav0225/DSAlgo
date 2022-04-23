package prac.graphs.articulationpoint;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Graph {
    private int V;
    private LinkedList<List<Integer>> adj;
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

    void APUtil(int currNode, boolean[] visited, int[] discTime, int[] lowestDiscTime, int[] parent, boolean[] ap) {
        int children = 0;
        visited[currNode] = true;
        discTime[currNode] = lowestDiscTime[currNode] = ++time;

        for (int adjNode : adj.get(currNode)) {
            if (!visited[adjNode]) {
                children++;
                parent[adjNode] = currNode;
                APUtil(adjNode, visited, discTime, lowestDiscTime, parent, ap);

                lowestDiscTime[currNode] = Math.min(lowestDiscTime[currNode], lowestDiscTime[adjNode]);
                if (parent[currNode] == NIL && children > 1)
                    ap[currNode] = true;
                if (parent[currNode] != NIL && lowestDiscTime[adjNode] >= discTime[currNode])
                    ap[currNode] = true;
            } else if (adjNode != parent[currNode])
                lowestDiscTime[currNode] = Math.min(lowestDiscTime[currNode], discTime[adjNode]);
        }
    }

    void AP() {
        boolean[] visited = new boolean[V];
        int[] discTime = new int[V];
        int[] lowestDiscTime = new int[V];
        int[] parent = new int[V];
        boolean[] ap = new boolean[V];

        Arrays.fill(parent, NIL);

        for (int node = 0; node < V; node++)
            if (!visited[node])
                APUtil(node, visited, discTime, lowestDiscTime, parent, ap);

        for (int node = 0; node < V; node++)
            if (ap[node])
                System.out.print(node + " ");
    }

    public static void main(String args[]) {
        System.out.println("Articulation points in first graph ");
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.AP();
        System.out.println();
    }
}
