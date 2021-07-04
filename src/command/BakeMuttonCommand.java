package command;

public class BakeMuttonCommand implements Command{

    private Barbecuer barbecuer;

    public BakeMuttonCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeMutton();
    }
}
