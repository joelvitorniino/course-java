package Exercises;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type number: ");
        char operation = sc.next().charAt(0);

        if(operation == '-') {
            System.out.println("Negative");
        } else {
            System.out.println("Not negative");
        }
    }
}
