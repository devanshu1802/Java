// import java.util.*;

// class dev{
// public static void main (String args[]){
// System.out.println("Java started on 8 June  ");

// Scanner sc = new Scanner(System.in);
// String name = sc.next();                     // nextLine() is used for inputting a whole line
//                                              // nextInt() is used for inputting a integer
// System.out.println(name);                    // nextFloat() is used for inputting a float
// }
// }

import java.util.*;
@SuppressWarnings("resource")

class Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of the numbers is sum "+sum);
        
        int[] marks = new int[3];               // Declaration of an array
        marks[0]=98;
        marks[1]=95;
        marks[2]=99;

        System.out.println(marks[0]);

    }
}
 