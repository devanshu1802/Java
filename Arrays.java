import java.util.Scanner;
@SuppressWarnings("resource")

public class Arrays {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      boolean statement = true;

      for(int i = 0; i < arr.length - 1; ++i) {
         if (arr[i] > arr[i + 1]) {
            statement = false;
         }
      }

      if (statement) {
         System.out.println("The array is sorted in ascending order");
      } else {
         System.out.println("The array is not sorted in ascending order");
      }

   }
}
