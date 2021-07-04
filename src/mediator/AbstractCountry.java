package mediator;

public class AbstractCountry implements Country{

    private String name;
    private UnitedNations unitedNations;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUnitedNations(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    @Override
    public void send(String msg) {
        unitedNations.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(name+"接受到消息:"+msg);
    }
}
