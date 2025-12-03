public class Engine {
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