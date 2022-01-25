package exercise3.src.model.entities;

import java.text.ParseException;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public String priceTag() throws ParseException {
        StringBuilder sb = new StringBuilder();

        sb.append(" $ " + getPrice());

        return sb.toString();
    }
}
