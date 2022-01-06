package Exercises;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number ");
        int number = sc.nextInt();

        System.out.println("Hours worked: ");
        int hoursWorked = sc.nextInt();

        System.out.println("Value a hour: ");
        double valueAHour = sc.nextDouble();

        double salary = hoursWorked * valueAHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
