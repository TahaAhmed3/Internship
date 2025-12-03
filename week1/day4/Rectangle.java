public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public final void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}