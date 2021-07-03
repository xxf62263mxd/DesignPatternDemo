package adapter;

public class Forwards implements Player{
    @Override
    public void attack() {
        System.out.println("前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋防守");
    }
}
