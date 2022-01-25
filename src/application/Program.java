package application;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("Get quantity: " + product.getQuantity());

        System.out.println();

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
