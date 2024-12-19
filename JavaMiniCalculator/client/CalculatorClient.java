package client;
import factory.OperationFactory;

import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("Select the operation (+, -, *, /):");
            String strOperation = sc.nextLine();
            System.out.println("Enter the second number:");
            double numberB = Double.parseDouble(sc.nextLine());
            double result = OperationFactory.createOperate(strOperation).getResult(numberA, numberB);
            System.out.println("The result is: " + result);
        }
        catch (Exception e) {
            System.out.println("==Error==");
        }
    }
}
