package Exercises;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double bought = sc.nextDouble();

        CurrencyConverter.multiplyCurrency(price, bought);
        double taxIOFOfCurrency = CurrencyConverter.taxIOFOfCurrency(price, bought);

        System.out.printf("Amount to be paid in reais = %.2f%n", taxIOFOfCurrency);
    }
}
