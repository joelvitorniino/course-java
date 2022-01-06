package Exercises;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type is number: ");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Odd");
        }
    }
}
