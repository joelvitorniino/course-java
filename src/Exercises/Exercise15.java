package Exercises;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type is number one: ");
        double numberOne = sc.nextDouble();

        System.out.println("Type is number two:");
        double numberTwo = sc.nextDouble();

        if(numberOne > 0.0 && numberTwo > 0.0) {
            System.out.println("Q1");
        }
        else if(numberOne > 0.0 && numberTwo < 0.0) {
            System.out.println("Q4");
        }
        else {
            System.out.println("Origin");
        }
    }
}
