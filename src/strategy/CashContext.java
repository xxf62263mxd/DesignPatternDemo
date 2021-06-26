package strategy;

/**
 * 收费上下文
 *
 * 工厂模式:挑选 具体的 收费策略 对象
 * 策略模式:根据上下文中配置的 收费策略 对象 来进行收费，该收费策略对象可以是由工厂模式创建的，也可以是外部传递进来的
 *
 * 所以
 * 工厂模式：负责 创建 对象
 * 策略模式：通过上下文来 使用 不同的策略对象
 *
 */
public class CashContext {

    //收费策略
    private CashStrategy cashStrategy;

    public CashContext(String cs){
        //工厂模式，创建 策略对象
        switch (cs){
            case "rebate":
                cashStrategy = new RebateCashStrategy(0.5);
                break;
            case "return":
                cashStrategy = new ReturnCashStrategy(500,200);
                break;
            default:
                cashStrategy = new NormalCashStrategy();
                break;
        }
    }

    public double getResult(double money){
        //策略模式，使用 收费策略 对象
        return cashStrategy.acceptCash(money);
    }
}
