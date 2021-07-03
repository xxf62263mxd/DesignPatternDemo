package adapter;

public class Guards implements Player{
    @Override
    public void attack() {
        System.out.println("后锋进攻");
    }

    @Override
    public void defense() {
        System.out.println("后锋防守");
    }
}
