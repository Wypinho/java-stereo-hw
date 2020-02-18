public class CDPlayer extends Component implements IPlay {
    private int cdCapacity;

    public CDPlayer(int cdCapacity, String make, String model){
        super(make, model);
        this.cdCapacity = cdCapacity;
    }

    public int getCdCapacity() {
        return cdCapacity;
    }

    public String play(String cd) {
        return "Tra la la";
    }

}
