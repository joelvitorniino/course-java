import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = sc.nextInt();

        int sum = 0;
        while(number != 0) {
            sum += number;
            number = sc.nextInt();
        }

        System.out.println("Result is: " + sum);

        sc.close();
    }
}
