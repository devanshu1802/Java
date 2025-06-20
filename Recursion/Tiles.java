public class Tiles {
    // Size of the tile is 1 x m
    // In this question we have to find how we can rearrange the tiles to cover the floor
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //Vertically
            int vertPlacements = placeTiles(n-m, m);

        //Horizontally
            int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n,m));
    }
    
}
