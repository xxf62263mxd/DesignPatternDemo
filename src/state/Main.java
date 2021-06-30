package state;


/**
 *
 * 状态模式
 *
 * 当对象的状态决定对象的行为时，可以用状态模式将特定状态的行为解耦出来
 * 并且可以避免因为判断多个状态而造成的庞大的分支语句
 *
 */

public class Main {
    public static void main(String[] args) {

        Work work = new Work();
        work.setFinishWork(true);
        work.setHour(10);
        work.handle();

    }
}
