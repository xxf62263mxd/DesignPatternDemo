package facade;

public class Fund {

    private Stock stock;
    private NationalDebt nationalDebt;

    public Fund(){
        this.stock = new Stock();
        this.nationalDebt = new NationalDebt();
    }

    public void buy(){
        stock.buy();
        nationalDebt.buy();
    }

    public void sell(){
        stock.sell();
        nationalDebt.sell();
    }


}
