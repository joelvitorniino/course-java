package exercise3.src.application;

import exercise3.src.model.entities.ImportedProduct;
import exercise3.src.model.entities.Product;
import exercise3.src.model.entities.UsedProduct;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char typeOfProduct = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(typeOfProduct == 'c') {
                Product product = new Product(name, price);

                list.add(product);
            }

            else if(typeOfProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());

                Product product = new UsedProduct(name, price, date);

                list.add(product);
            }

            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);

                list.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product product : list) {
            System.out.println(product.getName() + product.priceTag());
        }

        sc.close();
    }
}
