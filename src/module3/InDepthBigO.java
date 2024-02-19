package module3;

public class InDepthBigO {

    //O(n^2) since the number of operations will be n*n times
    public static void printItems(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.println(i + " " + j);
            }
        }
    }

    //O(1) due to the fact that the number of operations will always be the same
    //Do NOT confuse this reasoning as there only being 1 operation
    public static int addItems(int n){
        return n+n;
    }

    //O(log n) can be a tricky one to understand, the way I've always understood it best was through recursion
    //Remember or log base in CS will ALWAYS be 2, this adds a nice consistency to our studies
    //
    public static void OLogNWithRecursion(double n){
        if(n > 1) {
            n = Math.floor(n / 2);
            System.out.println("The loop ran");
            OLogNWithRecursion(n);
        }
        System.out.println("The loop finished");
    }


    //Here is a method with the same outcome but without recursion
    public static void OlogNWithNoRecursion(double n){
        for(int i = 1; n > 1; i++) {
            System.out.println(i);
            n = Math.floor(n /2);
        }

    }

    //O(n log n) can be a little confusing at first but let's break it into two parts
    //first part is our outer loop which is dictated by the while loop and us dividing n/2
    //this is identical to our O(log n) function above.
    //second part is our inner loop aka the for loop that will iterate as many times equal to n, there running at a complexity of n
    //when you combine these parts you get a complexity of O(n * log n) or O(n log n)
    public static void ONLogN(double n){
        double y = n;
        while(n > 1){
            n = Math.floor(n / 2);
            for(int i = 1; i <= y; i++){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
//        printItems(10);
//        OLogNWithRecursion(1);
//        OlogNWithNoRecursion(1);
//        ONLogN(4);
    }
}
