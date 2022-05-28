package Tutorial;

public class DemSoNguyenAm {
    public static void main(String[] args) {
        String gg = "HELLO WORLD";
        int vowels = 0;
        int consonant = 0;
        gg = gg.toLowerCase();

        for(int i = 0; i < gg.length(); i++) {
            char ch = gg.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonant " + consonant);
    }


}
