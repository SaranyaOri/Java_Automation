package Practice;

public class Operator_3 {
    public static void main(String[] args) {
        boolean a = true, b = false;
        boolean c = true || false;
        System.out.println(c);
        System.out.printf("O/P \n");
        System.out.println(!a);
        System.out.println(!!a);
        System.out.println(!!!a);
        System.out.println(!!!!a);
        System.out.println(!!!!!a);


        int salary = 12;
        boolean d = !(salary < 10 || salary < 5);
        System.out.printf("Salary is " + d);

    }
}
