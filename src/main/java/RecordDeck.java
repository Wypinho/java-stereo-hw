import java.util.ArrayList;

public class RecordDeck extends Component {
    private ArrayList<Integer> playSpeeds;

    public RecordDeck(String make, String model){
        super(make, model);
        this.playSpeeds = new ArrayList<Integer>();
        this.playSpeeds.add(33);
        this.playSpeeds.add(45);
    }

    public int getSpeedByIndex(int index) {
        return this.playSpeeds.get(index);
    }
}
