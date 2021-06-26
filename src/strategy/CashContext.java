package strategy;


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
