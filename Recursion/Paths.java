public class Paths{
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        // Move downwards
        int downpaths = countPaths(i+1, j, n, m);

        // Move right
        int rightpaths = countPaths(i, j+1, n, m);

        return downpaths + rightpaths;
    }
    public static void main(String arg[]){
        int n=3, m=3;
        int result = countPaths(0, 0, n, m);
        System.out.println(result);

    }
}