public class Car {
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