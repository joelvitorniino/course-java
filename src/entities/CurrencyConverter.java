package entities;

public class CurrencyConverter {
    public static final int IOF = 6;

    public static double multiplyCurrency(double price, double bought) {
        return price * bought;
    }

    public static double taxIOFOfCurrency(double price, double bought) {
        double multiplyCurrency = multiplyCurrency(price, bought);
        return (multiplyCurrency * IOF / 100) + multiplyCurrency;
    }
}
