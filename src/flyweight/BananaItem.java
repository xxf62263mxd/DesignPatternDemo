package flyweight;

public class BananaItem extends Item{

    public BananaItem() {
        super("香蕉");
    }

    @Override
    public void use(String username) {
        System.out.println(username+"吃了一个香蕉");
    }
}
