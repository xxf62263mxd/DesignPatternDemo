package strategy;

public class NormalCashStrategy implements CashStrategy{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
