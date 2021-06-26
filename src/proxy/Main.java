package proxy;

/**
 *
 * 代理模式
 *
 * A类在B类的基础上，再帮忙做别的事，A与B实现同一接口。
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("李娇娇");
        Proxy proxy = new Proxy("戴励",mm);
        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }
}
