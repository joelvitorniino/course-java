package Exercises;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type A: ");
        double A = sc.nextDouble();

        System.out.println("Type B: ");
        double B = sc.nextDouble();

        System.out.println("Type C: ");
        double C = sc.nextDouble();

        double triangleRectangle = (A * C) / 2;
        double circleOfC = 3.14159 * C * C;
        double areaTrapeze = (A + B) * C / 2;
        double areaSquare = B * B;
        double areaRectangle = A * B;

        System.out.printf("Triangle %.3f%n", triangleRectangle);
        System.out.printf("Circle %.3f%n", circleOfC);
        System.out.printf("Trapeze: %.3f%n", areaTrapeze);
        System.out.printf("Square: %.3f%n", areaSquare);
        System.out.printf("Rectangle: %.3f%n", areaRectangle);
    }
}
