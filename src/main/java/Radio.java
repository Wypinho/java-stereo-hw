public class Radio extends Component {
    private String station;

    public Radio(String make, String model){
        super(make, model);
        this.station = "";
    }

    private String getStation() {
        return station;
    }

    private void tune(String station) {
        this.station = station;
    }

    public String makeNoise(String choice) {
        this.tune(choice);
        return this.getStation();
    }
}
