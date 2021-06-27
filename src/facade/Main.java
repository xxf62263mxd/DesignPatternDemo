package facade;


/**
 *
 * 外观（门面）模式
 *
 * 在一个系统中，当多个子系统之间互相调用，而外部又要用到一个或多个子系统时（相当于一个系统内部很复杂）
 * 可以使用外观模式，做一个统一的接口暴露给外部使用
 *
 */
public class Main {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
