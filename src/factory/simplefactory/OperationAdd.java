package factory.simplefactory;

public class OperationAdd extends Operation{

    @Override
    public double getResult() {
        return getNum1()+getNum2();
    }
}
