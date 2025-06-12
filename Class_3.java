import java.util.*;
// Patterns related to numbers
public class Class_3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt()  ;

        for(int i=1; i<=n;i++){                             // 1
            for(int j=1; j<=i; j++){                        // 1 2
                System.out.print(j);                        // 1 2 3 
            }                                               // 1 2 3 4 
        System.out.println();
        }
    System.out.println();

        for(int i=1; i<=n; i++){                            // 1 2 3 4
            for(int j=1; j<=n-i+1; j++){                    // 1 2 3 
            System.out.print(j);                            // 1 2 
            }                                               // 1
        System.out.println();
        }
    System.out.println();
    
    int num=1;
    for(int i=1;i<=n;i++){                                  // Floyd's Triangle
        for (int j=1; j<=i; j++){                           // 1
            System.out.print(num+" ");                      // 2 3
            num++;                                          // 4 5 6
            }                                               // 7 8 9 10
        System.out.println();                               
        }
    System.out.println();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){                            // 1
            int sum = i+j;                                  // 0 1
            if(sum%2 == 0)                                  // 1 0 1
                System.out.print("1 ");                   // 0 1 0 1
            else                                            // 1 0 1 0 1
                System.out.print("0 ");
        }
        System.out.println();
        }
    }
    
}
