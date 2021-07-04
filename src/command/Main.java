package command;

/**
 *
 * 命令模式
 *
 * 1. 把 操作的请求 与 操作的执行 分开
 * 2. 记录操作的请求，方便 撤销与重做
 * 3. 方便将请求写入日志
 * 4. 方便 拒绝 操作的请求
 *
 */
public class Main {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Waiter waiter = new Waiter();


        Command bake1 = new BakeMuttonCommand(barbecuer);
        Command bake2 = new BakeMuttonCommand(barbecuer);
        Command bake3 = new BakeChickenWingCommand(barbecuer);

        waiter.addCommand(bake1);
        waiter.addCommand(bake2);
        waiter.addCommand(bake3);
        waiter.removeCommand(bake2);

        waiter.notifyAllCommand();

    }
}
