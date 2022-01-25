import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        try {
            System.out.println("***METHOD2 START***");

            Scanner sc = new Scanner(System.in);

            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.println(vect[position]);

            sc.close();
        } catch(InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
        }
    }
}
