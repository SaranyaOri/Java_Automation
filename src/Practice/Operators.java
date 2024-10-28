package Practice;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        // They are used to perform simple arithmetic operations on primitive and non-primitive data types.

        System.out.print("Arithmetic Operator \n");
        int a = 12, b = 6;
        System.out.println(a+b);    // addition
        System.out.println(a*b);    // Multiplication
        System.out.println(a/b);    // Division
        System.out.println(a-b);    // Subtraction
        System.out.println(a%b);    // Modulo


        //Unary Operators
        System.out.print("Unary Operators \n");
        int c = 7, d = 8;
        System.out.println(c++);    //Postincrement
        System.out.println(++c);    //Preincrement
        System.out.println(d--);    //PostDecrement
        System.out.println(--d);    //PreDecrement

        //Assignment Operator
        System.out.print("Assignment Operator \n");
        int E = 7;
        System.out.println( E = +3);
        System.out.println( E = -2);
        System.out.println( E *= 6);
        System.out.println( E /= 6);
        System.out.println( E <<= 9);
        System.out.println( E >>= 3);
        System.out.println( E <<= 1);
        System.out.println( E >>= 2);

        //  Relational Operators
        System.out.print("Relational Operator \n");
        int F = 5; int G = 6;
        System.out.println(F < G);
        System.out.println(F > G);
        System.out.println(F &= G);
        System.out.println(F == G);
        System.out.println(F != G);
        System.out.println(F <= G);
        System.out.println(F >= G);

        //  Logical Operators
        System.out.print("Logical Operator \n");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!y);

        // Ternary operator condition ? if true : if false
        System.out.print("Ternary Operator \n");
        int M = 20, N = 10, P = 30, result;
        result = ((M > N) ? (M > P) ? M : P : (N > P) ? N : P);
        System.out.println(result);

        // Shift operator number shift_op number_of_places_to_shift;
        System.out.print("Shift Operator \n");
        int Q = 10;
        System.out.println("a<<1 : " + (Q << 1));
        System.out.println("a>>1 : " + (Q >> 1));

    }
}
