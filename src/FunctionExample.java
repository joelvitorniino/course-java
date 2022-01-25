import java.util.Scanner;

public class FunctionExample {

    public static int higherNumber(int a, int b, int c) {
        int oneMax = Math.max(a, b);
        return Math.max(oneMax, c);
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxValue = higherNumber(a, b, c);

        showResult(maxValue);

        sc.close();
    }
}
