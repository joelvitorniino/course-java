package Exercises;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Code of product 1: ");
        int codeOne = sc.nextInt();

        System.out.println("Numbers of product 1: ");
        int numbersOfProductOne = sc.nextInt();

        System.out.println("Value unit of product 2: ");
        double valueUnitOfProductOne = sc.nextDouble();

        System.out.println("Code of product 2: ");
        int codeTwo = sc.nextInt();

        System.out.println("Numbers of product 2: ");
        int numbersOfProductTwo = sc.nextInt();

        System.out.println("Value unit of product 2");
        double valueUnitOfProductTwo = sc.nextDouble();

        double multiplicationProductOne = numbersOfProductOne * valueUnitOfProductOne;
        double multiplicationProductTwo = numbersOfProductTwo * valueUnitOfProductTwo;
        double resultTotal = multiplicationProductOne + multiplicationProductTwo;

        System.out.printf("Amount to pay: R$ %.2f", resultTotal);
    }
}
