import java.util.Scanner;

public class OperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        double account = 50.0;

        if(minutes > 100) {
            account += (minutes - 100) * 2.0;
        }

        System.out.printf("Value of account = R$ %.2f%n", account);

        sc.close();
    }
}
