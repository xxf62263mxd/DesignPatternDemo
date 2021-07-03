package adapter;

public class Translator implements Player{

    private ForeignCenter foreignCenter;

    public Translator(ForeignCenter foreignCenter) {
        this.foreignCenter = foreignCenter;
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.defense();
    }
}
