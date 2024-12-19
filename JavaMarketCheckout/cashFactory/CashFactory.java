//package cashFactory;
//import cashSuper.*;
//
//public class CashFactory {
//    public static CashSuper createCashAccept(int cashType){
//        CashSuper cs = null;
//        switch (cashType){
//            case 1:
//                cs = new CashNormal();
//                break;
//            case 2:
//                cs = new CashRebate(0.8);
//                break;
//            case 3:
//                cs = new CashReturn(300,100);
//                break;
//        }
//        return cs;
//    }
//}
