import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Type a temperature on Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalent in Fahrenheit: %.1f%n", F);

            System.out.print("Want to repeat (y/n)? ");
            resp = sc.next().charAt(0);
        } while(resp != 'n');

        sc.close();
    }
}
