package strategy;

import java.util.Scanner;


/**
 * 策略模式
 *
 * 根据上下文中配置的 收费策略 对象 来进行收费，该收费策略对象可以是由工厂模式创建的，也可以是外部传递进来的
 *
 * 与工厂模式的区别：
 * 工厂模式：负责 创建 对象
 * 策略模式：通过上下文来 使用 不同的策略对象
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strategy = sc.nextLine();
        CashContext cc = new CashContext(strategy);

        Double cash = Double.parseDouble(sc.nextLine());

        Double result = cc.getResult(cash);
        System.out.println(result);
    }
}
