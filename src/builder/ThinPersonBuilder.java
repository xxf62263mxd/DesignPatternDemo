package builder;

public class ThinPersonBuilder implements PersonBuilder{

    private Person person;

    public ThinPersonBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        String head = "大头的";
        this.person.setHead(head);
    }

    @Override
    public void buildBody() {
        String body = "胖的";
        this.person.setBody(body);
    }

    @Override
    public void buildHand() {
        String hand = "大手的";
        this.person.setHand(hand);
    }

    @Override
    public void buildFoot() {
        String foot = "肥足的";
        this.person.setFoot(foot);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
