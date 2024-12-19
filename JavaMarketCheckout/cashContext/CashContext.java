package cashContext;
import cashSuper.*;

public class CashContext {
    private CashSuper cs;

    public CashContext(int cashType){
        switch (cashType){
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashRebate(0.8);
                break;
            case 3:
                cs = new CashReturn(300,100);
                break;
        }
    }

    public double getResult(double price,int num){
        return this.cs.acceptCash(price,num);
    }
}
