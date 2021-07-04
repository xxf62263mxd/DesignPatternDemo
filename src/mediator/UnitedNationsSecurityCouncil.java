package mediator;

public class UnitedNationsSecurityCouncil implements UnitedNations{

    private USA usa;
    private Ireq ireq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIreq(Ireq ireq) {
        this.ireq = ireq;
    }

    @Override
    public void send(String msg, Country country) {
        if(country == usa){
            ireq.receive(msg);
        }else{
            usa.receive(msg);
        }
    }
}
