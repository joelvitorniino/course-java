package Exercises;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number one: ");
        int numberOne = sc.nextInt();

        System.out.println("Number two: ");
        int numberTwo = sc.nextInt();

        int maxValue = Math.max(numberOne, numberTwo);
        int minValue = Math.min(numberOne, numberTwo);

        if(maxValue % minValue == 0) {
            System.out.println("Multiplies");
        } else {
            System.out.println("Not multiplies");
        }
    }
}
