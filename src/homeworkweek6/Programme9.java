package homeworkweek6;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a upper case");
        String UpperCase = scanner.nextLine();
        String LowerCase = UpperCase. toLowerCase();
        System.out.println("Enter the String in lowercase" + LowerCase);
        scanner.close();
    }

}
