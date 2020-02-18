import java.util.ArrayList;

public class Stereo {
    private String name;
    private ArrayList<Component> components;

    public Stereo(String name){
        this.name = name;
        components = new ArrayList<Component>();
    }

    public int componentCount() {
        return this.components.size();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public String playCD(String cd) {
        Component cdPlayer = getComponent(1);
        return cdPlayer.play(cd);
    }

    private Component getComponent(int index) {
        return this.components.get(index);
    }
}
