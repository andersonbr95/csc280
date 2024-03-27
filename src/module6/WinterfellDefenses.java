package module6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WinterfellDefenses {

    public static void treeToList(BinarySearchTree.Node node, LinkedList<Integer> list){

        if(node == null)
            return;

        treeToList(node.left, list);

        list.add(node.value);

        treeToList(node.right, list);
    }
    public static int sumOfWallWeakness(BinarySearchTree.Node root, int low, int high){
        if(root == null) return 0;

        Queue<BinarySearchTree.Node> nodeQueue = new LinkedList<>();
        int sumOfWallWeakness = 0;
        LinkedList<Integer> values = new LinkedList<>();
        treeToList(root, values);
        int count = 0;
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            BinarySearchTree.Node currentNode = nodeQueue.peek();
            nodeQueue.remove();

            if(currentNode.value >= low && currentNode.value <= high) {
                sumOfWallWeakness += currentNode.value;
                count++;
            }

            if(currentNode.left != null && currentNode.value > low)
                nodeQueue.add(currentNode.left);

            if(currentNode.right != null && currentNode.value < high)
                nodeQueue.add(currentNode.right);
        }

        System.out.println("Winterfell Defense Report:");
        System.out.println("Current Walls that can be examined: " + values);
        System.out.println("Upper Bound Defense: " + high);
        System.out.println("Lower Bound Defense: " + low);
        System.out.println("Number of Walls in Range: " + count);
        System.out.println("Sum of Vulnerabilities in Range: " + sumOfWallWeakness);

        return sumOfWallWeakness; //you're going to need to switch this return statement with your solution. You should not be returning 0
    }
    class Node{
        int value;
        BinarySearchTree.Node left;
        BinarySearchTree.Node right;
        private Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[] winterfellWalls = {10, 5, 15, 7, 13, 2, 18, 20};
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        for(int element : winterfellWalls)
            binarySearchTree.insert(element);

        sumOfWallWeakness(binarySearchTree.root, 5, 18);
    }
}
