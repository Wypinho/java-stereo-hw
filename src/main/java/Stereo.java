import java.util.ArrayList;

public class Stereo {
    private String name;
    private ArrayList<IMakeNoise> components;
    private int volume;

    public Stereo(String name){
        this.name = name;
        components = new ArrayList<IMakeNoise>();
        this.volume = 0;
    }

    public int componentCount() {
        return this.components.size();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    private IMakeNoise getComponent(int index) {
        return this.components.get(index);
    }

    public String tuneRadio(String station) {
        IMakeNoise radio = getComponent(0);
        return radio.makeNoise(station);
    }

    public String playCD(String cd) {
        IMakeNoise cdPlayer = getComponent(1);
        return cdPlayer.makeNoise(cd);
    }

    public String playRecord(String record) {
        IMakeNoise recordDeck = getComponent(2);
        return recordDeck.makeNoise(record);
    }

    public int getVolume() {
        return volume;
    }

    public void raiseVolume() {
        if (this.volume < 11) {
            this.volume += 1;
        }
    }

    public void lowerVolume() {
        if (this.volume > 0){
            this.volume -= 1;
        }
    }
}
