package proxy;

public class Pursuit implements IGiveGirl{

    private SchoolGirl mm;
    private String name;

    public Pursuit(String name,SchoolGirl mm) {
        this.name = name;
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(name+"送玩偶给"+mm.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println(name+"送花花给"+mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println(name+"送巧克力给"+mm.getName());
    }
}
