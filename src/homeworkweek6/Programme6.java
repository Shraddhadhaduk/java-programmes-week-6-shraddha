package homeworkweek6;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius value");
        double r = scanner.nextDouble();
        double pi = 3.14;
        System.out.println(" Area of circle " + pi * r * r);
        scanner.close();


    }
}
