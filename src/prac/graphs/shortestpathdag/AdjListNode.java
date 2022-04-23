package prac.graphs.shortestpathdag;

public class AdjListNode {
    private int v;
    private int weight;

    public AdjListNode(int v, int w) {
        this.v = v;
        this.weight = w;
    }

    public int getV() {
        return v;
    }

    public int getWeight() {
        return weight;
    }
}