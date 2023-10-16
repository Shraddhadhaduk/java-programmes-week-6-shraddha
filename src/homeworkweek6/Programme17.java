package homeworkweek6;

import java.util.Scanner;

/**
 *  Write a Java program to convert a decimal number to binary number.
 */
public class Programme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int a = scanner.nextInt();
        System.out.println("Binary equivalent of " + a + " is : ");
        System.out.println(Integer.toBinaryString(a));
        scanner.close();
    }

}
