package Practice;

public class Ternary {
    public static void main(String[] args) {
        int a=10, b=30, c=20;
        int result = (a >= b && a >= c) ? a : (b>=c ? b : c);
        System.out.println("Max Number is " +  result);

        int number = -5;
        String result1 = number > 0 ? "Positive" : "Negative";
        System.out.println("The Number is " + result1);

        int age = 19;
        String result2 = age > 18 ? "Allowed to Vote" : "Not Allowed to Vote";
        System.out.println("The Age is " + result2);

        int score = 90;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Your Grade is " + grade);
        System.out.printf("Your Grade is %s", grade);
    }
}
