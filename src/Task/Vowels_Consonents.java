package Task;
import java.util.Scanner;

public class Vowels_Consonents {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the character: ");
        //nextLine() -Scanner method can read a line of text until it hits Enter
        String text = str.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); //used to retrieve a specific character from the string
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " - is a vowel");
                vowelsCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " - is a consonant");
                consonantsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
