package homeworkweek6;
/**
 * Write a program to calculate the area of a triangle
 */
import java.util.Scanner;

  public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base of triangle");
        float base = scanner.nextFloat();
        System.out.println("Please enter a height of triangle");
        float height = scanner.nextFloat();
        float area = (base * height)/ 2;
        System.out.println("Area of Triangle is : " + area);
        scanner.close();
    }
}
