public class Recursion{
    // To find the sum of first n natural numbers
    
    public static void printsum(int i , int n ,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printsum(i+1, n, sum);
    }

    public static void main(String arg[]){
        printsum(1, 7, 0);

    }
}