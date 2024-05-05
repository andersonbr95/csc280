package module9;

import java.util.LinkedList;
import java.util.Stack;

public class ValidPath {

    static public boolean isValidPath(GraphMatrix graph, int[][] edges, int start, int destination){
        int maxNode = Math.max(start, destination);

        for(int[] edge : edges)
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));

        graph = new GraphMatrix(maxNode + 1);

        for(int[] edge : edges)
            graph.addDirectedEdge(edge[0], edge[1]);

        boolean[] visited = new boolean[graph.matrix.length];
        LinkedList<Integer> queue = new LinkedList<>();
        boolean resultant = depthFirstSearch(graph, start, destination, visited, queue);

        if(resultant) {
            System.out.print(resultant + ", Order of Buildings Visited: " + queue + "\n");
        } else {
            System.out.print(resultant + "\n");
        }
        return resultant;
    }

    public static boolean depthFirstSearch(GraphMatrix graph, int start, int destination, boolean[] visited, LinkedList<Integer> queue){
        if(start == destination){
            queue.add(start);
            return true;
        }
        visited[start] = true;
        queue.add(start);

        for(int i = 0; i < graph.matrix.length; i++){
            if(graph.matrix[start][i] == 1 && !visited[i]){
                if(depthFirstSearch(graph, i, destination, visited, queue)){
                    return true;
                }
            }
        }

        queue.remove(queue.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        int[][] graph1points;
        int[][] graph2points;

        GraphMatrix graph1 = new GraphMatrix(3);
        GraphMatrix graph2 = new GraphMatrix(10);

        graph1points = new int[][]{{0, 1}, {1, 2}, {2,3} , {3,0} };
        graph2points = new int[][]{{0, 2}, {1, 2}, {1, 3}, {2, 5}, {3, 4}, {3, 6} , {4,3} , {5, 8} , {6, 5} , {6, 7}, {7, 6}};

        System.out.println("-----Hawkeye's Rooftop Navigation Report-----");
        System.out.println("Is there a valid path from building 1 to building 3 in graph 1?: ");

        isValidPath(graph1, graph1points,1, 3);

        System.out.println("Is there a valid path from building 0 to building 7 in graph 2?: ");
        isValidPath(graph2, graph2points ,0, 7);

        System.out.println("Is there a valid path from building 3 to building 8 in graph 2?: ");
        isValidPath(graph2, graph2points, 3, 8);


    }
}
