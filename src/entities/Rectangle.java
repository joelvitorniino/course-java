package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
        double width = this.width * this.width;
        double height = this.height * this.height;
        double sum = width + height;

        return Math.sqrt(sum);
    }
}
