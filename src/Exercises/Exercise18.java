package Exercises;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = sc.nextInt();

        while(number != 2002) {
            number = sc.nextInt();

            System.out.println("Access not allowed");
        }

        while(number == 2002) {
            number = sc.nextInt();

            System.out.println("Access allowed");
        }
    }
}
