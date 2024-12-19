package factory;

import  operation.*;

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new Addition();
                break;
            case "-":
                oper = new Subtraction();
                break;
            case "*":
                oper = new Multiplication();
                break;
            case "/":
                oper = new Division();
                break;

        }
        return oper;
    }
}
