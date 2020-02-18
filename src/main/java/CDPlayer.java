public class CDPlayer extends Component {
    private int cdCapacity;

    public CDPlayer(int cdCapacity, String make, String model){
        super(make, model);
        this.cdCapacity = cdCapacity;
    }

    public int getCdCapacity() {
        return cdCapacity;
    }
}
