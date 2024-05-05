package module9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {
    ArrayList<Node> nodes;
    int [][] matrix;

    GraphMatrix(int size) {
        nodes = new ArrayList<>();
        matrix= new int [size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addDirectedEdge(int source, int target){
        matrix[source][target] = 1;
    }

    public void addUndirectedEdge(int source, int target){
        matrix[source][target] = 1;
        matrix[target][source] = 1;
    }

    public boolean checkEdge(int source, int target){
        return matrix[source][target]==1;
    }

    public void printAll(){
        System.out.print("   ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int begin){
        boolean[] visited = new boolean[matrix.length];
        depthFirstHelper(begin, visited);
    }
    /*
     * This is a helper method for Depth-First Search(DFS).
     */
    private void depthFirstHelper(int source, boolean[] visited){
        // Stops recursion if the node was already visited
        if(visited[source]){
            return;
        }
        // Marks the node as visited
        visited[source] = true;
        // Prints out the node that is currently visited
        System.out.println(nodes.get(source).data + " = visited");

        // Iterates over all the neighboring nodes
        for(int i = 0; i < matrix[source].length; i++){
            // Checks if there is a neighbor and if it hasn't been visited yet
            if(matrix[source][i]==1 && !visited[i]){
                // Recursively applies the method on each unvisited neighboring node
                depthFirstHelper(i, visited);
            }
        }
    }

   public void BFS(int s){
        Queue<Integer> queue = new LinkedList<>();
       boolean[] visited = new boolean[matrix.length];
       visited[0] = true;

       //adds first node to the BFS
       queue.add(s);


       while (!queue.isEmpty()) {
           // Dequeue a vertex from the queue and print it
           s = queue.poll();
           System.out.println("Visited node: " + s);

           // Get all unvisited neighbors of the dequeued vertex s
           // If a neighbor has not been visited, then mark it visited and enqueue it
           for(int i = 0; i < matrix.length; ++i) {
               if(matrix[s][i] == 1 && !visited[i]) {
                   queue.add(i);
                   visited[i] = true;
               }
           }
       }
   }

    static class  Node {
        String data;

        public Node(String data) {
            this.data = data;
        }

    }
}
