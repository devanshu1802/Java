public class Subsequences{

    public static void func(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // To add to new string
        func(str, idx+1, newString+currChar);

        // To not add 
        func(str, idx+1, newString);
    }

    public static void main(String arg[]){
        String str = "dev";
        func(str, 0, "");
    }
}