package operation;

public class Division extends Operation{
    public double getResult(double numberA,double numberB){
        if(numberB == 0){
            System.out.println("Error: Division by zero");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
