package Task;
import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the 5 digit number");   // Original number we want to reverse
        int num = n.nextInt();
        int rev = 0;       // Variable to store the reversed number

        while(num > 0){
            int lastDigit = num % 10;      // Get the last digit
            num = num / 10;                // Remove the last digit from num
            rev = (rev * 10) + lastDigit;  // Append the digit to rev
        }
        System.out.println("Reversed number: " + rev);
    }
}
