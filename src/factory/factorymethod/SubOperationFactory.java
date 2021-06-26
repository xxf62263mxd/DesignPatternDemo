package factory.factorymethod;

public class SubOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
