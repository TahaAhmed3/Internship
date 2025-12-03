
public class TestCar {
    public static void main(String[] args) {
        Engine engine = new Engine("V6", 200);
        Car car = new Car("Toyota", 2023, engine);

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Engine:");
        System.out.println("\tType: " + car.getEngine().getType());
        System.out.println("\tHorse Power: " + car.getEngine().getHorsePower());

        car.getEngine().setHorsePower(250);
        System.out.println("\nModified Engine Horse Power: " + car.getEngine().getHorsePower());
    }
}