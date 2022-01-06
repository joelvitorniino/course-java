package Exercises;

public class Exercise02 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.println(product2 + ", which price is $ " + price2);
        System.out.println();

        System.out.printf("Record: %s years old, code %d and gender: %c", age, code, gender);
        System.out.println();
        System.out.println();

        System.out.printf("Measure with eight decimal places: %f", measure);
        System.out.println();
        System.out.printf("Rounded (three decimal places): %.3f", measure);
        System.out.println();
        System.out.printf("US decimal point: %.3f", measure);
    }
}
