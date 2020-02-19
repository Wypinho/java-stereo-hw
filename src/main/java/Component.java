public abstract class Component implements IMakeNoise {
    private String make;
    private String model;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
