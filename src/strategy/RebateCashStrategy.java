package strategy;

public class RebateCashStrategy implements CashStrategy{

    private double rebate;

    public RebateCashStrategy(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
