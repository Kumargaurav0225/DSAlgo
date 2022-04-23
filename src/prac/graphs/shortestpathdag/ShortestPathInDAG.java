package prac.graphs.shortestpathdag;

import prac.graphs.shortestpathdag.Graph;

public class ShortestPathInDAG {

    /*
    *  First perform topological sorting using dfc and store vertices in stack
    *  Pop stack and for each adjacent nodes of pop vertex ,relax the distance and update distance array
    *  For each element of distance array print INF if distance is infinite else print the print distance
    * */

    public static void main(String args[])
    {

        Graph g = new Graph(6);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(1, 2, 3);
        g.addEdge(4, 2, 2);
        g.addEdge(4, 5, 4);
        g.addEdge(2, 3, 6);
        g.addEdge(5, 3, 1);

        int s = 0;
        System.out.println("Following are shortest distances "+
                "from source " + s );
        g.shortestPath(s);
    }
}
