package Task;

import java.util.Scanner;

public class User_1_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();
    }
}
