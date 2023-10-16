package homeworkweek6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Fahrenheit Temperature");
        float fahrenheit = scanner.nextFloat();
        System.out.println("Please enter a Celsius Temperature");
        float Celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in celsius is :" + Celsius);
        scanner.close();

    }
}
