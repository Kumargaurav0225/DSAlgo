package prac.graphs;

import java.util.Arrays;

public class DijkstraAlgoNaive {
    public static void main(String[] args) {
        int graph[][] = new int[][]{
                {0, 50, 100, 0},
                {50, 0, 30, 200},
                {100, 30, 0, 20},
                {0, 200, 20, 0}};

        for (int x : djikstra(graph, 0)) {
            System.out.print(x + " ");
        }
    }

    private static int[] djikstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;
        boolean[] fin = new boolean[V];

        for (int count = 0; count < V - 1; count++) {
            int u = -1;

            for (int i = 0; i < V; i++)
                if (!fin[i] && (u == -1 || dist[i] < dist[u]))
                    u = i;

            fin[u] = true;

            for (int adjNode = 0; adjNode < V; adjNode++)
                if (!fin[adjNode] && graph[u][adjNode] != 0)
                    dist[adjNode] = Math.min(dist[adjNode], dist[u]+graph[u][adjNode]);
        }
        return dist;
    }
}
