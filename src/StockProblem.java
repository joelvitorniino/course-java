//import java.util.Scanner;
//import entities.Product;
//
//public class StockProblem {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Product product = new Product();
//
//        System.out.println("Enter product data:");
//        System.out.println("Name: ");
//        product.name = sc.next();
//
//        System.out.println("Price: ");
//        product.price = sc.nextDouble();
//
//        System.out.println("Quantity in stock: ");
//        int old = product.quantity = sc.nextInt();
//
//        double total = product.totalValueInStock();
//
//        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, old, total);
//
//        System.out.println("Enter the number of products to be added in stock: ");
//        int quantity = sc.nextInt();
//        product.addProducts(quantity);
//
//
//        System.out.println("Updated data: " + product);
//
//        System.out.println("Enter the number of products to be removed from stock: ");
//        quantity = sc.nextInt();
//        product.removeProducts(quantity);
//
//        System.out.println("Updated data: " + product);
//    }
//}
