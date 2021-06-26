package factory.simplefactory;

public class OperationSub extends Operation{


    @Override
    public double getResult() {
        return getNum1()-getNum2();
    }
}
