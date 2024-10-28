package Task;

public class Max_Num {
    public static void main(String[] args) {
        int num1 = 20; // Example number 1
        int num2 = 55; // Example number 2

        // Using ternary operator to find maximum
        int max = (num1 > num2) ? num1 : num2;

        // Printing the result
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
