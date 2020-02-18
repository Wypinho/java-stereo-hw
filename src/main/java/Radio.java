public class Radio extends Component {
    private String station;

    public Radio(String make, String model){
        super(make, model);
        this.station = "";
    }

    public String getStation() {
        return station;
    }


    public void tune(String station) {
        this.station = station;
    }
}
