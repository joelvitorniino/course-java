package Exercises;
import java.util.Scanner;
import entities.Rectangle;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        double area = rectangle.area();
        System.out.println("AREA = " + area);

        double perimeter = rectangle.perimeter();
        System.out.println("PERIMETER = " + perimeter);

        double diagonal = rectangle.diagonal();
        System.out.println("DIAGONAL = " + diagonal);
    }
}
