package entities;

public class Calculator {
    public static final double PI = 3.14;
    public static double radius;

    public static double circumferenceOfRadius() {
        return 2 * radius * PI;
    }

    public static double volumeOfRadius() {
        double radiusElevated = Math.pow(radius, 3);
        return (radiusElevated * PI * 4) / 3;
    }
}
