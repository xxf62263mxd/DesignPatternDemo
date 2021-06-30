package factory.abstractfactory;


/**
 *
 * 抽象工厂 + 反射
 *
 * 在多牌子且多产品的情况下使用，抽象工厂完成依赖倒置，反射完成开闭原则
 *
 */

public class Main {
    public static void main(String[] args) {
        ISelect s = DataAccess.createSelect();
        s.select();

        IUpdate u = DataAccess.createUpdate();
        u.update();
    }
}
