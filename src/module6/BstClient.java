package module6;
public class BstClient {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(56);
        binarySearchTree.insert(34);
        binarySearchTree.insert(33);
        binarySearchTree.insert(75);
        binarySearchTree.insert(34);
        System.out.println(binarySearchTree.root.value);
        System.out.println(binarySearchTree.contains(53));
        System.out.println(binarySearchTree.contains(34));
        System.out.println(binarySearchTree.root.value);
        System.out.println(binarySearchTree.contains(34));
        binarySearchTree.printInOrder(binarySearchTree.root);
    }
}

