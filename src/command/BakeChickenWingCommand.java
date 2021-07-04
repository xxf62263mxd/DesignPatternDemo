package command;

public class BakeChickenWingCommand implements Command{

    private Barbecuer barbecuer;

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeChickenWing();
    }
}
