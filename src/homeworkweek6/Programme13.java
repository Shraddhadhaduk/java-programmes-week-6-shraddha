package homeworkweek6;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input the first number");
        double x = scanner.nextDouble();
        System.out.println("Please Input the second number");
        double y = scanner.nextDouble();
        System.out.println("Please Input the third number");
        double z = scanner.nextDouble();
        double average = (x + y + z) / 3;
        System.out.println("The average of three number is :" + average);
        scanner.close();
     }

}
