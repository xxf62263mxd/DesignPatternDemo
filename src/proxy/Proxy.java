package proxy;

public class Proxy implements IGiveGirl{

    private Pursuit pursuit;
    private String name;



    public Proxy(String name,SchoolGirl mm) {
        this.name = name;
        pursuit = new Pursuit("卓贾易",mm);
    }

    @Override
    public void giveDolls() {
        System.out.print(name+"帮");
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.print(name+"帮");
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        System.out.print(name+"帮");
        pursuit.giveFlowers();
    }
}
