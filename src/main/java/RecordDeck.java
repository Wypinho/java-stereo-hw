import java.util.ArrayList;

public class RecordDeck extends Component implements IPlay {
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

//    @Override
    public String play(String record) {
        return "Tra la la";
    }

    public String makeNoise(String choice) {
        return this.play(choice);
    }
}
