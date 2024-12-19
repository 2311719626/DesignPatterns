package cashSuper;

public class CashRebate extends CashSuper{
    private double moneyRebate = 1d;
    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double price,int num){
        return price * num * this.moneyRebate;
    }
}
