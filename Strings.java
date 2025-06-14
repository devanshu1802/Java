import java.util.*;
public class Strings {
    public static void main(String arg[]){

        String firstname = "Devanshu";
        String lastname = "Singh";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname.length());

    // For printing a char at a index
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    // Comparing 2 Strings
        // s1 > s2 : +ve value
        // s1 = s2 : 0
        // s1 < s2 : -ve value

        if(firstname.compareTo(lastname)==0){
            System.out.println("Strings are Equal");
        }
        else
            System.out.println("They are not equal");

    // Substring
        // substring(begin index, end index)
        System.out.println(firstname.substring(3));

// ------------------String builder----------------

        StringBuilder sb = new StringBuilder("sinsinwar");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

    // To replace a character at a given index
        sb.setCharAt(0,'S');
        System.out.println(sb);

    // To insert something in a string
        sb.insert(0, "Devdat ");
        System.out.println(sb);

    // To delete a char or a substring
        sb.delete(0, 6);
        System.out.println(sb);

    // To append something at the end
        sb.append(" Don");
        System.out.println(sb);
    }
    
}
