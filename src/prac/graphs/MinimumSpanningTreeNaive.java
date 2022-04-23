package prac.graphs;

import java.util.Arrays;

/* Current solution time complexity O(V2)
 * It can be further optimised by using adjacency list representation  and min heap and then time complexity will be O(E*logV)
 *  */
public class MinimumSpanningTreeNaive {

    public static void main(String[] args) {
        int graph[][] = new int[][]{
                {0, 5, 8, 0},
                {5, 0, 10, 15},
                {8, 10, 0, 20},
                {0, 15, 20, 0}};

        System.out.print(primMST(graph));
    }

    private static int primMST(int[][] graph) {
        final int V = graph.length;
        int res = 0;

        int[] key = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;

        boolean[] mSet = new boolean[V];

        for (int count = 0; count < V; count++) {
            int u = -1;

            for (int i = 0; i < V; i++) // visit vertex and set in mst
                if (!mSet[i] && (u == -1 || key[i] < key[u]))
                    u = i;

            mSet[u] = true;
            res += key[u]; //update res for u

            relaxAdjacentVertices(graph, V, key, mSet, u);
        }

        return res;
    }

    private static void relaxAdjacentVertices(int[][] graph, int V, int[] key, boolean[] mSet, int u) {
        for (int v = 0; v < V; v++)    // update distance for adjacent vertices
            if (graph[u][v] != 0 && !mSet[v])
                key[v] = Math.min(key[v], graph[u][v]);
    }
}
