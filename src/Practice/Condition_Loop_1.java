package Practice;

public class Condition_Loop_1 {
    // Shortcut main + tab or psvm
    public static void main(String[] args) {
        // Go to top right 3 dot, Go to Run/Edit Configuration, select CLI arguments
        // Its Client Provided Input

        // Create a Program to check wheather Suresh will go to Goa OR NOT
        // Take a input age = Suresh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator
        // System.out.println(args[0]);

        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s, %s, %s", args[0], args[1], args[2]);
        int age = Integer.parseInt(args[1]);
        System.out.println();
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
