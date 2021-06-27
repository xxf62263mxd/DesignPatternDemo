package builder;

public class FatPersonBuilder implements PersonBuilder{
    private Person person;

    public FatPersonBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        String head = "小头的";
        this.person.setHead(head);
    }

    @Override
    public void buildBody() {
        String body = "瘦的";
        this.person.setBody(body);
    }

    @Override
    public void buildHand() {
        String hand = "小手的";
        this.person.setHand(hand);
    }

    @Override
    public void buildFoot() {
        String foot = "瘦足的";
        this.person.setFoot(foot);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
