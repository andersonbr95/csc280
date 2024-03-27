package module6;
public class BinarySearchTree {
    Node root;
    // public BinarySearchTree(){
//// root = null; //this constructor becomes irrelevant as the Node root
//    variable that we've created is null just as we're setting it equal to null in the
//    constructor.
//    // //this means that we don't need this constructor.
//// }
    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value){ //if the node being inserted is less we're going to insert left
                if (temp.left == null) { //if the node to the left of the current node is empty, we're going to insert into the open left spot
                    temp.left = newNode;
                    return true; //sends us to the top of the loop
                }
                temp = temp.left;
            }
            if(newNode.value > temp.value){ //if the node being inserted is greater we're going to insert right
                if(temp.right == null){ //if the node to the right of the current node is empty, we're going to insert into the open right spot
                    temp.right = newNode;
                    return true; //sends us to the top of the loop
                }
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value){
        if(root == null) return false; //this line isn't necessary but is good for learning purposes
        Node temp = root;
        while(temp != null){ //this loop is going to run until temp is null, meaning that if the node isn't in there temp will eventually become null and break the loop
            if(value < temp.value){
                temp = temp.left;
            }else if (value > temp.value) {
                temp = temp.right;
            }else return true;
        }
        return false;
    }
    public int minValue(Node root) {
        int minVal = root.value;
        while (root.left != null) {
            minVal = root.left.value;
            root = root.left;
        }
        return minVal;
    }
    public int maxValue(Node root){
        int maxVal = root.value;
        while(root.right != null){
            maxVal = root.right.value;
            root = root.right;
        }
        return maxVal;
    }
    // Recursively delete the node with the given value from the tree
    public Node deleteRecursively(Node root, int value) {
// The tree is empty
        if (root == null) {
            return root;
        }
// Traverse the tree
        if (value < root.value) // traverse left subtree
            root.left = deleteRecursively(root.left, value);
        else if (value > root.value) // traverse right subtree
            root.right = deleteRecursively(root.right, value);
        else {
// Delete the node with no child or one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
// Node with two children: get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);
// Delete the inorder successor
            root.right = deleteRecursively(root.right, root.value);
        }
        return root;
    }
    public void delete(int value) {
        root = deleteRecursively(root, value);
    }
    public void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }
    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }
    class Node{
        int value;
        Node left;
        Node right;
        private Node(int value){
            this.value = value;
        }
    }
}
