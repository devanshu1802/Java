import java.util.*;
@SuppressWarnings("resource")

// Shape Patterns
public class Patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);                        
        int n = sc.nextInt();                                       
        int m = sc.nextInt();                                       
                                                                    
        for(int i=1; i<=n ; i++){                                   
            for (int j=1; j<=m ; j++){                              // * * * * 
                if(i==1 || j==1 || i==n || j==m)                    // *     * 
                System.out.print(" *");                           // *     * 
                else                                                // * * * *
                System.out.print("  ");
                }
            System.out.println();
            }

        System.out.println();
        
        for(int i=1; i<=n ; i++){                                    // *
            for(int j=1; j<=i; j++){                                 // * * 
                System.out.print(" *");                            // * * * 
            }                                                        // * * * * 
            System.out.println();
        }
         
        System.out.println();
        
        for(int i=n; i>=1; i--){                                    // * * * * 
            for (int j=i; j>=1; j--){                               // * * * 
                System.out.print(" *");                           // * * 
            }                                                       // * 
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){
            // Inner loop for space print                           //        *
            for(int j=1; j<=n-i; j++){                              //      * *
                System.out.print("  ");                           //    * * *
            }                                                       //  * * * *
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();


    }
    
}
                                                                            
