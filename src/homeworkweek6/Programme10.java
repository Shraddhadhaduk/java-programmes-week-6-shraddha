package homeworkweek6;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10
 */
import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println("multiplication of " + number + " and" + 1 + " is : " + (number * 1));
        System.out.println("multiplication of " + number + " and" + 2 + " is : " + (number * 2));
        System.out.println("multiplication of " + number + " and" + 3 + " is : " + (number * 3));
        System.out.println("multiplication of " + number + " and" + 4 + " is : " + (number * 4));
        System.out.println("multiplication of " + number + " and" + 5 + " is : " + (number * 5));
        System.out.println("multiplication of " + number + " and" + 6 + " is : " + (number * 6));
        System.out.println("multiplication of " + number + " and" + 7 + " is : " + (number * 7));
        System.out.println("multiplication of " + number + " and" + 8 + " is : " + (number * 8));
        System.out.println("multiplication of " + number + " and" + 9 + " is : " + (number * 9));
        System.out.println("multiplication of " + number + " and" + 10 + " is : " + (number * 10));
        scanner.close();
    }
}
