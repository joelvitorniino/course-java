package Exercises;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type is code of product: ");
        int codeOfProduct = sc.nextInt();

        System.out.println("Type is amount of product: ");
        int amountOfProduct = sc.nextInt();

        if(codeOfProduct == 1) {
            double multiplicationOfProduct = amountOfProduct * 4.00;
            System.out.printf("Total: R$ %.2f%n", multiplicationOfProduct);
        }
        else if(codeOfProduct == 2) {
            double multiplicationOfProduct = amountOfProduct * 4.50;
            System.out.printf("Total: R$ %.2f%n", multiplicationOfProduct);
        }
        else if(codeOfProduct == 3) {
            double multiplicationOfProduct = amountOfProduct * 5.00;
            System.out.printf("Total: R$ %.2f%n", multiplicationOfProduct);
        }
        else if(codeOfProduct == 4) {
            double multiplicationOfProduct = amountOfProduct * 2.00;
            System.out.printf("Total: R$ %.2f%n", multiplicationOfProduct);
        }
        else {
            double multiplicationOfProduct = amountOfProduct * 1.50;
            System.out.printf("Total: R$ %.2f%n", multiplicationOfProduct);
        }
     }
}
