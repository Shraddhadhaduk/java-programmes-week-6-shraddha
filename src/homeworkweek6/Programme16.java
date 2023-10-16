package homeworkweek6;
/**
 * Write a Java program to add two binary numbers
 */

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number");
        String x = scanner. next();
        System.out.println("Input second binary number");
        String y = scanner.next();


        int a = Integer.parseInt(x, 2);
        int b = Integer.parseInt(y, 2);
        int c = a+b;

        System.out.println(" a : " + Integer.toBinaryString(a));
        System.out.println(" b : " + Integer.toBinaryString(b));
        System.out.println(" c=a+b : " + Integer.toBinaryString(c));
        scanner.close();

    }
}
