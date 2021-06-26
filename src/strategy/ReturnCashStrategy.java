package strategy;

public class ReturnCashStrategy implements CashStrategy{

    private double condition;
    private double ret;

    public ReturnCashStrategy(double condition, double ret) {
        this.condition = condition;
        this.ret = ret;
    }

    @Override
    public double acceptCash(double money) {
        if(money >= condition){
            return money - ret;
        }

        return money;
    }
}
