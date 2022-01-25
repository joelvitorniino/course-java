import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");
        int N = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);
    }
}
