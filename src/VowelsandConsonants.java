public class VowelsandConsonants {
    public static void main(String[] args) {
        String a = "Encyclopedia";
        String lowercase = a.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i<lowercase.length();i++){
            char ch = lowercase.charAt(i);

            if(Character.isLetter(ch)){
                if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else {consonants++;}
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
