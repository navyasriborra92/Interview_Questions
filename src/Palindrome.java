public class Palindrome {
    public static void main(String[] args) {
        String a = "Madam";
        String reversed = "";
        String lowercase = a.toLowerCase();
        for (int i = a.length()-1;i>=0;i--){
            reversed += a.charAt(i);
        }

        if(lowercase.equals(reversed.toLowerCase())){
            System.out.println("the word is palindrome");
        }
        else {
            System.out.println("The word is not palindrome");
        }

        String b = "racecar";
        String lowercase1 = b.toLowerCase();
        String reversed1 = "";
        reversed1 = new StringBuilder(lowercase1).reverse().toString();
        if(lowercase1.equals(reversed1)){
            System.out.println( b+ " is palindrome");
        }
        else{
            System.out.println(b+" is not palindrome");
        }
    }
}
