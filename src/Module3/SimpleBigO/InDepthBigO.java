package module3;

public class InDepthBigO {

    public static void printItems(int n ){
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
            System.out.println(i + " " + j);
        }
    }
}

public static int addItems(int n){
        return n+n;
}



public static void OLogWithRecursion(double n){
        if(n > 1){
            n = Math.floor(n / 2);
            System.out.println("The Loop ran");
            OLogWithRecursion(n);
        }
        System.out.println("The loop is finished");
    }

    
    public static void ONlogN(double n){
        double y = n;
        
        while(n > 1){
            n = Math.floor(n/2);
            for(int i = 1; i <= y; i ++){
                System.out.println(i)
            }
        }
    }
    

public static void main(String{} args){
    printItems(n: 4):



    }
}