package module3;

public class SimpleBigO {


   //O(n) the number of operations performed is equal to n or the number of times the loop is going to execute
    public static void printItems(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.println(i);
        }
    }


    //This will still be O(n) because it isn't going to matter as the problem size increases
    public static void droppingConstants(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.println(i);
        }

        for(int j = 0 ; j < n ; j++){
            System.out.println(j);
        }
    }



    public static void main(String[] args){
        droppingConstants(10);
    }
}
