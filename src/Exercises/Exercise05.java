package Exercises;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1: ");
        double numberOne = sc.nextDouble();

        double result = 3.14159 * numberOne * numberOne;

        System.out.printf("Result is: %.4f", result);
    }
}
