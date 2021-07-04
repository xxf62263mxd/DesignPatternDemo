package flyweight;


/**
 *
 * 享元模式
 *
 * 分离 类中 外部因素（可变因素） 和 内部因素（不可变因素）
 * 使用 少部分对象实例 代替 数量众多的对象实例，从而大量节省内存
 *
 * 例如：
 * 五子棋：棋子 与 棋盘 ,棋子的（行为）不会发生变化，只需要一个实例，变化的只有他在棋盘上的坐标与颜色
 * Minecraft:Item 与 ItemStack ，Item代表一个物品的（行为，模型，效果），ItemStack代表具体拿在手里的物品，会有数量，所有者信息等
 *
 * 只有在出现大量细粒度对象实例时，考虑使用享元模式，因为维护享元模式还需要一张记录表，也会占用内存
 *
 * 外部因素可以通过参数的形式，传递到共享的对象内部
 *
 */
public class Main {
    public static void main(String[] args) {

        ItemStack myApples = new ItemStack("apple","peck",10);
        myApples.use();
        myApples.use();

    }
}
