package Exercises;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1: ");
        int numberOne = sc.nextInt();

        System.out.println("Number 2: ");
        int numberTwo = sc.nextInt();

        int result = numberOne + numberTwo;

        System.out.println("Result is: " + result);

        sc.close();
    }
}
