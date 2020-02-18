import java.util.ArrayList;

public class RecordDeck {
    private ArrayList<Integer> playSpeeds;

    public RecordDeck(){
        this.playSpeeds = new ArrayList<Integer>();
        this.playSpeeds.add(33);
        this.playSpeeds.add(45);
    }

    public int getSpeedByIndex(int index) {
        return this.playSpeeds.get(index);
    }
}
