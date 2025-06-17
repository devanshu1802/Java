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

// To find the Fibonacci series 

    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return ;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }

// To find the Power of a number

    public static int caclPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x * caclPower(x, n-1);

    }
    public static void main(String arg[]){
    // Natural Numbers
        printsum(1, 7, 0);

    // Factorial
        int factorial =calfactorial(5);
        System.out.println("The factorial of the given number is "+factorial);

    // Fibonacci
        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibonacci(a, b, n-2);

    // Power
        int ans= caclPower(2, 5);
        System.out.println(ans);


    }
}