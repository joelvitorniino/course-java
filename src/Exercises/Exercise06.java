package Exercises;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type A: ");
        int A = sc.nextInt();

        System.out.println("Type B: ");
        int B = sc.nextInt();

        System.out.println("Type C: ");
        int C = sc.nextInt();

        System.out.println("Type D: ");
        int D = sc.nextInt();

        int result = (A * B - C * D);
        System.out.println("Result is: " + result);
    }
}
