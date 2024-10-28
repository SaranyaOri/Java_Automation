package Practice;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        // Scanner - Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age \n");
        // int age = scanner.nextInt();
//        float age = scanner.nextFloat();
        double age = scanner.nextDouble();

        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");

        String username = scanner.next();

        scanner.close();
    }
}
