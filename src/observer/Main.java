package observer;

/**
 *
 * 观察者模式
 *
 * 当两个类之间存在一致性需求（一个类发生变化，另一个类就要跟着发生变化）时，可以使用观察者模式
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Subject boss = new Boss();
        Observer zhangsan = new ZhangSan(boss);

        boss.attach(zhangsan);
        boss.setState("老板我回来了");
        boss.notifyObserver();
    }
}
