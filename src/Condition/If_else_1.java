package Condition;

import java.util.Scanner;

public class If_else_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        if(age > 18){
            System.out.println("Allowed to Vote!");
        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
