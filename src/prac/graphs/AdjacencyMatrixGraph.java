package prac.graphs;

// Adjacency Matrix representation in Java
public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numOfVertices;

    // Initialize the matrix
    public AdjacencyMatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.adjMatrix = new boolean[numOfVertices][numOfVertices];
    }

    // Add edges
    public void addEdges(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdges(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < numOfVertices; i++) {
            s.append(i + " ");
        }
        s.append("\n");
        s.append("   _______\n");
        for (int i = 0; i < numOfVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(4);

        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 2);
        graph.addEdges(2, 0);
        graph.addEdges(2, 3);

        System.out.println(graph.toString());
    }
}
