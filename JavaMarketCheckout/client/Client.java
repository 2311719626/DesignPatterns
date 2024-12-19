package client;

import cashContext.CashContext;
// import cashFactory.CashFactory;
// import cashSuper.CashSuper;

import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        int type = 1;
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double price;
        int num;
        double totalPrices;
        // CashSuper csuper = null;
        CashContext cc;
        do{
            System.out.println("Please enter the type of discount: (1. normal, 2. rebate, 3. return)");

            type = Integer.parseInt(sc.nextLine());
            // csuper = CashFactory.createCashAccept(type);
            cc = new CashContext(type);
            System.out.println("Please enter the price of the goods:");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("Please enter the number of goods:");
            num = Integer.parseInt(sc.nextLine());

            if(price > 0 && num > 0){
                // totalPrices = csuper.acceptCash(price,num);
                totalPrices = cc.getResult(price,num);
                total = total + totalPrices;
                System.out.println();
                System.out.println("The price of the goods is: " + totalPrices);
                System.out.println("The total price of the goods is: " + total);
            }


        }while(price > 0 && num > 0);
    }
}
