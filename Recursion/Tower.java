
public class Tower{

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk"+ n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk"+ n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String arg[]){
        int n=3;
        towerOfHanoi(n, "S", "H", "D");
    }
}