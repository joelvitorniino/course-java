package Exercises;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to calculator");
        System.out.println("Type is operation: ");
        char operation = sc.next().charAt(0);

        System.out.println("Number 1: ");
        int numberOne = sc.nextInt();

        System.out.println("Number 2: ");
        int numberTwo = sc.nextInt();

        if(operation == '+') {
            int result = numberOne + numberTwo;
            System.out.println("Result is " + result);
        }

        if(operation == '-') {
            int result = numberOne - numberTwo;
            System.out.println("Result is " + result);
        }

        if(operation == '*') {
            int result = numberOne * numberTwo;
            System.out.println("Result is " + result);
        }

        if(operation == '/') {
            int result = numberOne / numberTwo;
            System.out.println("Result is " + result);
        }

        sc.close();
    }
}
