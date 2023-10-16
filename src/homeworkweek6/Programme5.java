package homeworkweek6;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5 {
     // is an Instance method
    public void addition(int a, int b){
        System.out.println("addition of " + a + " and " + b + " is : "  + (a + b));
    }

    public void subtraction(int a, int b){
        System.out.println("subtraction of " + a + " and " + b + " is : " + (a - b));
    }
    // is a Static method
    public static void multiplication(int a, int b){
        System.out.println("multiplication of " + a + " and" + b + " is : " + (a * b));
    }
    public static void division(int a, int b){
        System.out.println("division of " + a + " and " + b + " is : " + (a / b));
    }
    // call both methods in main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme5 obj = new Programme5();
        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        division(a,b);
        scanner.close();
    }

}
