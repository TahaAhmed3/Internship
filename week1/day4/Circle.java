public class Circle extends Shape {

    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    final public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}