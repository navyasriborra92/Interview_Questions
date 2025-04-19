public class ReverseString {

    public static void main(String[] args) {
        //Without built in functions
        String a  = "Hello World";
        String ReverseString = "";

        for (int i = a.length() -1; i>=0 ; i--){
            ReverseString += a.charAt(i);
        }
        System.out.println(ReverseString);
        //built in function stringbuilder
        ReverseString = new StringBuilder(a).reverse().toString();
        System.out.println(ReverseString);
    }
}
