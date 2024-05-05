package module9;

public class GraphClient {

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);
        //GraphList graphList = new GraphList();
        graph.addNode(new GraphMatrix.Node("A"));
        graph.addNode(new GraphMatrix.Node("B"));
        graph.addNode(new GraphMatrix.Node("C"));
        graph.addNode(new GraphMatrix.Node("D"));
        graph.addNode(new GraphMatrix.Node("E"));

        graph.addDirectedEdge(0, 1);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(1, 4);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(2, 4);
        graph.addDirectedEdge(4, 0);
        graph.addDirectedEdge(4, 2);

        graph.printAll();
        graph.depthFirstSearch(0);



        GraphMatrix g = new GraphMatrix(4);

// Add edges
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(1, 2);
        g.addUndirectedEdge(2, 0);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");

        g.BFS(2);
    }

}
