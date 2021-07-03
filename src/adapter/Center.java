package adapter;

public class Center implements Player{
    @Override
    public void attack() {
        System.out.println("中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋防守");
    }
}
