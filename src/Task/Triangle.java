package Task;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side3:");
        double side3 = scanner.nextDouble();

        // Input validation for positive sides
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive numbers.");
            return; // Exit the program early
        }

        // Check if the sides can form a triangle using the Triangle Inequality Theorem
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("The entered sides do not form a valid triangle.");
            return; // Exit the program early
        }

        if (side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }

        scanner.close();
    }
}
