package prac.graphs.targanalgo;

import java.util.*;

class Graph {
    private int V;
    private LinkedList<LinkedList<Integer>> adj;
    private int time;

    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList<>();
        for (int i = 0; i < v; ++i)
            adj.add(new LinkedList<>());

        time = 0;
    }
    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void SCCUtil(int node, int[] lowestDiscTime, int[] discTime, boolean[] stackMember, Stack<Integer> st) {
        discTime[node] = time;
        lowestDiscTime[node] = time;
        time += 1;
        stackMember[node] = true;
        st.push(node);

        for (int adjNode: adj.get(node)) {
            if (discTime[adjNode] == -1) {
                SCCUtil(adjNode, lowestDiscTime, discTime, stackMember, st);
                lowestDiscTime[node] = Math.min(lowestDiscTime[node], lowestDiscTime[adjNode]);
            } else if (stackMember[adjNode]) {
                lowestDiscTime[node] = Math.min(lowestDiscTime[node], discTime[adjNode]);
            }
        }

        int w = -1;
        if (lowestDiscTime[node] == discTime[node]) {
            while (w != node) {
                w = st.pop();
                System.out.print(w + " ");
                stackMember[w] = false;
            }
            System.out.println();
        }
    }

    void SCC() {
        int[] discTime = new int[V];
        int[] lowestDiscTime = new int[V];
        for (int i = 0; i < V; i++) {
            discTime[i] = -1;
            lowestDiscTime[i] = -1;
        }

        boolean[] stackMember = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for (int vertex = 0; vertex < V; vertex++)
            if (discTime[vertex] == -1)
                SCCUtil(vertex, lowestDiscTime, discTime, stackMember, st);
    }

    public static void main(String args[]) {
        Graph g = new Graph(5);

        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        System.out.println("SSC in the graph ");
        g.SCC();

    }
}
