import entities.Products;

import java.util.Scanner;

public class VectorTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vector = new Products[n];

        for(int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vector[i] = new Products(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double avg = sum / vector.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
