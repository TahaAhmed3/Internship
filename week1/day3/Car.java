
class Car {
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

    private final String model;
    private final int year;
    private Engine engine;

    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
}


class Engine {
    private String type;
    private int horsePower;

    public Engine(String type, int horsePower) {
        setType(type);
        setHorsePower(horsePower);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower > 0) {
            this.horsePower = horsePower;
        }
    }

}
