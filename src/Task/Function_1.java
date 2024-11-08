package Task;
import java.util.Scanner;

public class Function_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int a = sc.nextInt();
        System.out.println("Enter the Num2");
        int b = sc.nextInt();

        int result = sum_of_numbers(a,b);
        System.out.println("Sum is " + result);

        sc.close();
    }

    static int sum_of_numbers(int a, int b) {
        return a + b;
    }
}
