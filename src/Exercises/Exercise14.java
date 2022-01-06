package Exercises;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type is number: ");
        double number = sc.nextDouble();

        if(number >= 0 && number <= 25) {
            System.out.println("Interval [0,25]");
        }
        else if(number >= 25 && number <= 50) {
            System.out.println("Interval [25,50]");
        }
        else if(number >= 50 && number <= 75.00) {
            System.out.println("Interval [50,75]");
        }
        else if(number >= 75 && number <= 100) {
            System.out.println("Interval [75,100]");
        }
        else {
            System.out.println("Out of interval");
        }

        sc.close();
    }
}
