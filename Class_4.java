import java.util.*;
@SuppressWarnings("resource")
// Advance Patterns
public class Class_4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
// Butterfly Pattern 
        // Upper Half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            // For Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            // For Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

// Rhombus

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++)
                System.out.print(" ");            
            for (int j=1; j<=n; j++)
                System.out.print(" *");            
    
            System.out.println();
        }
        System.out.println();

// Hollow Rhombus

        for (int i=1; i<=n ; i++) {
            for (int j=1; j<=n-i; j++)
                System.out.print(" ");
            for (int j=1; j<=n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

// Number Pyramid

        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            // Numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
             System.out.println();
        }
        System.out.println();

// Palindromic Patter

        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // 1st Half
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            // 2nd Half
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

// Diamond Pattern

        for (int i = 1; i <=n ; i++) {
            // Spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            // Upper Half
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         for (int i = n; i >=1 ; i--) {
            // Spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            // Upper Half
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
   