
public class Bits {
   public static void main(String args[]) {
// Get Bit
    // To know the value of the bit at a given position
      int n = 5; //0101
      int pos = 3;
      int bitMask = 1<<pos;


      if((bitMask & n) == 0) {
          System.out.println("bit was zero");
      } else {
          System.out.println("bit was one");
      }

// Set Bit
    // To change the value of bit to 1 at a given position
      int posi = 1;
      int BitMask = 1<<posi;
      int newNumber = BitMask | n;
      System.out.println(newNumber);

// Clear Bit
    // To change the value of bit to 0 at a given position
     int position = 2;
     int bitmask = 1<<position;
     int newBitMask = ~(bitmask);
     int sol = newBitMask & n;
     System.out.println(sol);
   }
}
