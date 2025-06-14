
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
    }
    
}
