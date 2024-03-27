
public class WinterfellDefenses {

    public static class binarySearchTree {
        Node find;

        binarySearchTree() {
            find = null;
        }

        Node Upper(Node up, int num) {
            if (up.value < num) {
                return Upper(up.right, num);
            }
            return up.right;
        }


        Node lower(Node lower, int number) {
            if (lower.value > number) {
                return lower(lower.left, number);
            }
            return lower.left;
        }

        Node insert(Node make, int k) {
            if (make == null) {
                return new Node(k);
            }
            if (k < make.value) {
                make.left = insert(make.left, k);

            } else if (k > make.value) {
                make.right = insert(make.right, k);
            }
            return make;
        }


        public int sumOfWallWeakness(Node root, int low, int high) {

            if(root == null) {
                return 0;
            }

            if (root.value >= low && root.value <= high) {
                return  root.value + sumOfWallWeakness(root.left, low, high) + sumOfWallWeakness(root.right, low, high);
            } else if (root.value > high) {
                return sumOfWallWeakness(root.left, low, high);
            } else {
                return sumOfWallWeakness(root.right, low, high);
            }
        }

        public int sumOfRange(Node count, int low, int high) {
            if (count == null) {
                return 0;

            }
            if (count.value >= low && count.value <= high) {
                return 1 + sumOfRange(count.left, low, high) + sumOfRange(count.right, low, high);

            } else if (count.value > low) {
                return sumOfRange(count.right, low, high);
            } else {
                return sumOfRange(count.left,low, high);
            }


        }



        class Node {
            int value;


            binarySearchTree.Node left;
            binarySearchTree.Node right;


            private Node(int value) {
                this.value = value;
                left = null;
                right = null;
            }
        }


        public static void main(String[] args) {
            int[] winterfellWalls = {10, 5, 15, 7, 13, 2, 18, 20};
            int winterWall = winterfellWalls.length;
            binarySearchTree tree = new binarySearchTree();
            for (int num : winterfellWalls) {
                tree.find = tree.insert(tree.find, num);
            }
            int low = 5;
            int high = 18;


            System.out.println("Winterfell Defense Report: ");
            System.out.println("Current Walls that can be examined: " + tree.find);
            System.out.println("Upper Bound Defense: " + high );
            System.out.println("Lower Bound Defense: " + low);
            System.out.println("Number of Walls in Range: " + tree.sumOfRange(tree.find, low, high));
            System.out.println("Sum of Vulnerabilities in Range: " + tree.sumOfWallWeakness(tree.find, low, high));
        }
    }
}





