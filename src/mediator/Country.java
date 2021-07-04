package mediator;

public interface Country {

    void setName(String name);
    void setUnitedNations(UnitedNations unitedNations);
    void send(String msg);
    void receive(String msg);
}
