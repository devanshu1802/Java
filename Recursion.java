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

    // To find the factorial of a given number

    public static int calfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{

            return n* calfactorial(n-1);
        }
    }


    public static void main(String arg[]){
        printsum(1, 7, 0);

        int factorial =calfactorial(5);
        System.out.println("The factorial of the given number is "+factorial);

    }
}