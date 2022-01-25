package Exercises;
import java.util.Scanner;
import entities.Calculator;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Radius: ");
        Calculator.radius = sc.nextDouble();

        double circumferenceOfRadius = Calculator.circumferenceOfRadius();
        System.out.printf("Circumference: %.2f%n", circumferenceOfRadius);

        double volumeOfRadius = Calculator.volumeOfRadius();
        System.out.printf("Volume: %.2f%n", volumeOfRadius);

        System.out.println("PI value: " + Calculator.PI);
    }
}
