package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class Programme18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first number");
        int a = scanner.nextInt();
        System.out.println("Please enter a second number");
        int b = scanner.nextInt();
        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println(a + "%" + b + "=" + (a%b));
        scanner.close();
        }


}
