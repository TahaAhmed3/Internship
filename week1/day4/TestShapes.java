
public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle("red", 5.0), new Rectangle("green", 4.0, 6.0) };

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Color: " + shape.getColor());
            shape.draw();
            System.out.println("-------------------");
        }
    }
}