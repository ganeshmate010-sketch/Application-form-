import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = "a,e,i,o,u";
        
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;
        
        // Traverse string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            // Check alphabet (consonant)
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
            // Check digit
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Otherwise special character
            else {
                specialChars++;
            }
        }
        
        // Display result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
        
        sc.close();
    }
}
