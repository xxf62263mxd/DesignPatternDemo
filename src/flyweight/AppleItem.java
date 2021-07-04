package flyweight;

public class AppleItem extends Item{

    public AppleItem() {
        super("苹果");
    }

    @Override
    public void use(String username) {
        System.out.println(username+"吃了一个苹果");
    }
}
